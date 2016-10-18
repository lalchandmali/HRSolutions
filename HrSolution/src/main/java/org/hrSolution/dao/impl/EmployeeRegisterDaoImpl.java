package org.hrSolution.dao.impl;

import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.EmployeeRegisterDao;
import org.hrSolution.model.EmployeeRegistrationModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository are the DAOs(Data Access Objects), they access the database
 * directly.
 * */
@Repository("employeeRegisterDao")
@Transactional
public class EmployeeRegisterDaoImpl extends
		AbstractDao<Integer, EmployeeRegistrationModel> implements
		EmployeeRegisterDao {

	public void saveEmployee(EmployeeRegistrationModel employeeRegistrationModel) {
		persist(employeeRegistrationModel);

	}

}
