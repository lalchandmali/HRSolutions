package org.hrSolution.dao;

import org.hrSolution.model.EmployeeRegistrationModel;

/**
 * Interface for registering employee
 * */
public interface EmployeeRegisterDao {
	void saveEmployee(EmployeeRegistrationModel employeeRegistrationModel);
}
