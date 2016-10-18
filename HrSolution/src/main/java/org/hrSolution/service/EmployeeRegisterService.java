package org.hrSolution.service;

import org.hrSolution.model.EmployeeRegistrationModel;

/**
 * @author Lalchand Mali
 *
 */
public interface EmployeeRegisterService {
	/**
	 * register method is a abstract method so it does not contains
	 * implementation Implementation will be in EmployeeRegisterImpl class.
	 * */
	Boolean register(EmployeeRegistrationModel employeeRegistrationModel);
}
