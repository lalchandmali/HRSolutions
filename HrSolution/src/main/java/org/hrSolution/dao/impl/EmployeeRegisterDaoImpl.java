package org.hrSolution.dao.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.EmployeeRegisterDao;
import org.hrSolution.model.EmployeeRegistrationModel;
import org.hrSolution.service.redis.RedisService;
import org.hrSolution.status.constant.RedisTemplateConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

/**
 * Repository are the DAOs(Data Access Objects), they access the database
 * directly.
 * */
@Repository("employeeRegisterDao")
@Transactional
public class EmployeeRegisterDaoImpl extends
		AbstractDao<Integer, EmployeeRegistrationModel> implements
		EmployeeRegisterDao {

	private static final Logger logger = LogManager
			.getLogger(EmployeeRegisterDaoImpl.class);
	/**
	 * Creating Object of RedisTemplate
	 * */
	@Autowired
	RedisService redisService;

	/**
	 * This method is used for storing data into Database and saving into redis
	 * cache server
	 * */
	public void saveEmployee(EmployeeRegistrationModel employeeRegistrationModel) {

		try {
			/**
			 * Storing Employee Registration Data into Database
			 * */
			persist(employeeRegistrationModel);
			/**
			 * Converting object into String using JSOn Api
			 * */
			Gson gson = new Gson();
			String emp = gson.toJson(employeeRegistrationModel);

			/**
			 * Saving registration object into Redis cache server
			 * */
			redisService.setValue(RedisTemplateConstant.EMPLOYEE_KEY,
					employeeRegistrationModel.getEmployeeId(), emp);
			/**
			 * getting value from redis cache
			 * */
			Object obj = redisService.getValue(
					RedisTemplateConstant.EMPLOYEE_KEY,
					employeeRegistrationModel.getEmployeeId());

			EmployeeRegistrationModel object = gson.fromJson(obj.toString(),
					EmployeeRegistrationModel.class);

			System.out.println(object.getEmployeeName());
		} catch (Exception exception) {
			logger.debug("Exception occured " + exception.getMessage());
		}

	}

}
