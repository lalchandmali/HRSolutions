package org.hrSolution.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hrSolution.dao.EmployeeRegisterDao;
import org.hrSolution.model.EmployeeRegistrationModel;
import org.hrSolution.service.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lalchand Mali
 *
 */
@Service("employeeRegisterService")
@Transactional
public class EmployeeRegisterImpl implements EmployeeRegisterService {
	private static final Logger logger = LogManager
			.getLogger(EmployeeRegisterImpl.class);

	@Autowired
	EmployeeRegisterDao employeeRegisterDao;

	/**
	 * This is the implementation class of Service class and it provides
	 * implementation of all method of service class.
	 * 
	 * */
	public Boolean register(EmployeeRegistrationModel employeeRegistrationModel) {
		try {
			employeeRegisterDao.saveEmployee(employeeRegistrationModel);
		} catch (Exception exception) {
			logger.debug("Exception occured " + exception);
			return false;
		}

		return true;
	}

}
