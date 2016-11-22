package org.hrSolution.dao.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.CompanyRoleDao;
import org.hrSolution.model.CompanyRoleModel;
import org.hrSolution.service.redis.RedisService;
import org.hrSolution.status.constant.RedisTemplateConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

/**
 * Repository are the DAOs(Data Access Objects), they access the database directly.
 * */
@Repository("compRoleDao")
@Transactional
public class CompanyRoleDaoImpl extends AbstractDao<Integer, CompanyRoleModel> implements CompanyRoleDao{
	
	private static final Logger logger = LogManager
			.getLogger(EmployeeRegisterDaoImpl.class);
	/**
	 * Creating Object of RedisTemplate
	 * */
	@Autowired
	RedisService redisService;
	
	public void addRole(CompanyRoleModel compRoleModel) {
		
		
		try {
			/**
			 * Storing Employee Registration Data into Database
			 * */
			persist(compRoleModel);
			/**
			 * Converting object into String using JSOn Api
			 * */
			Gson gson = new Gson();
			String emp = gson.toJson(compRoleModel);

			/**
			 * Saving registration object into Redis cache server
			 * */
			redisService.setValue(RedisTemplateConstant.ROLE_KEY,
					compRoleModel.getRoleId().toString(), emp);
			/**
			 * getting value from redis cache
			 * */
			Object obj = redisService.getValue(
					RedisTemplateConstant.ROLE_KEY,
					compRoleModel.getRoleId().toString());

			CompanyRoleModel object = gson.fromJson(obj.toString(),
					CompanyRoleModel.class);

			System.out.println(object.getRoleName());
		} catch (Exception exception) {
			logger.debug("Exception occured " + exception.getMessage());
		}
		
	}

}
