package org.hrSolution.dao.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.CompanyDepartmentDao;
import org.hrSolution.model.CompanyDepartmentModel;
import org.hrSolution.service.redis.RedisService;
import org.hrSolution.status.constant.RedisTemplateConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

/**
 * Repository are the DAOs(Data Access Objects), they access the database
 * directly.
 */
@Repository("compDeptDao")
@Transactional
public class CompanyDepartmentDaoImpl extends AbstractDao<Integer, CompanyDepartmentModel>
		implements CompanyDepartmentDao {

	private static final Logger logger = LogManager.getLogger(EmployeeRegisterDaoImpl.class);
	/**
	 * Creating Object of RedisTemplate
	 */
	@Autowired
	RedisService redisService;

	public void saveDepartment(CompanyDepartmentModel compDeptModel) {
		/* persist(compDeptModel); */

		try {
			/**
			 * Storing Employee Registration Data into Database
			 */
			persist(compDeptModel);
			/**
			 * Converting object into String using JSOn Api
			 */
			Gson gson = new Gson();
			String emp = gson.toJson(compDeptModel);

			/**
			 * Saving registration object into Redis cache server
			 */
			redisService.setValue(RedisTemplateConstant.COMPANYDEPARTMENT_KEY, compDeptModel.getcompanyID().toString(),
					emp);
			/**
			 * getting value from redis cache
			 */
			Object obj = redisService.getValue(RedisTemplateConstant.COMPANYDEPARTMENT_KEY,
					compDeptModel.getcompanyID().toString());

			CompanyDepartmentModel object = gson.fromJson(obj.toString(), CompanyDepartmentModel.class);

			System.out.println(object.getCompanyDepartmentName());
		} catch (Exception exception) {
			logger.debug("Exception occured " + exception.getMessage());
		}

	}

}
