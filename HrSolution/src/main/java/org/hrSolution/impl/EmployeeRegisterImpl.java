package org.hrSolution.impl;

import org.hrSolution.dao.EmployeeRegisterDao;
import org.hrSolution.model.EmployeeRegistrationModel;
import org.hrSolution.service.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeRegisterService")
@Transactional
public class EmployeeRegisterImpl implements EmployeeRegisterService {

	@Autowired
	EmployeeRegisterDao employeeRegisterDao;
	
	/**
	 * This is the implementation class of Service class and it provides
	 * implementation of all method of service class.
	 * 
	 * */
	public Boolean register(EmployeeRegistrationModel employeeRegistrationModel) {
		employeeRegisterDao.saveEmployee(employeeRegistrationModel);
		
		
		return true;
	}

	
	
}
