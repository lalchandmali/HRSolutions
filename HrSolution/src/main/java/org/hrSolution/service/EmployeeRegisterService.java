package org.hrSolution.service;

import org.hrSolution.model.EmployeeRegistrationModel;
import org.springframework.stereotype.Service;

@Service("employeeRegisterService")
public abstract class EmployeeRegisterService {

	/**
	 * register method is a abstract method so it does not contains implementation
	 * Implementation will be in EmployeeRegisterImpl class.
	 * */
	public abstract Boolean register(EmployeeRegistrationModel employeeRegistrationModel);
		
}
