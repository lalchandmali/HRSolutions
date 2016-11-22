package org.hrSolution.dao.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.CompanyRegistrationDao;
import org.hrSolution.model.CompanyAddress;
import org.hrSolution.model.CompanyRegistrationModel;
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
@Repository("companyRegistartionDao")
@Transactional
public class CompanyRegistationDaoImpl extends AbstractDao<Integer, CompanyRegistrationModel>
		implements CompanyRegistrationDao {

	private static final Logger logger = LogManager.getLogger(CompanyRegistationDaoImpl.class);

	/**
	 * Creating Object of RedisTemplate
	 */
	@Autowired
	RedisService redisService;

	public void saveCompany(CompanyRegistrationModel companyRegistrationModel, CompanyAddress companyAddress) {

		try {
			// persist(companyRegistrationModel);
			companyAddress.setCompanyRegistrationModel(companyRegistrationModel);
			saveOrUpdate(companyRegistrationModel);
			getSession().saveOrUpdate(companyAddress);

			/**
			 * Converting object into String using JSOn Api
			 */
			Gson gson = new Gson();
			companyAddress.setCompanyRegistrationModel(null);
			String cmp = gson.toJson(companyRegistrationModel);
			
			
			/**
			 * Saving registration object into Redis cache server
			 */
			redisService.setValue(RedisTemplateConstant.COMPANY_KEY, companyRegistrationModel.getCompanyId().toString(),
					cmp);
			/**
			 * getting value from redis cache
			 */
			Object obj = redisService.getValue(RedisTemplateConstant.COMPANY_KEY,
					companyRegistrationModel.getCompanyId().toString());

			CompanyRegistrationModel object = gson.fromJson(obj.toString(), CompanyRegistrationModel.class);

			System.out.println(object.getCompanyName());

		} catch (Exception exception) {
			logger.debug("Exception occured " + exception.getMessage());
		}

	}

}
