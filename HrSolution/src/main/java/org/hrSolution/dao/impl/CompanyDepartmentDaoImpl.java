package org.hrSolution.dao.impl;

import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.CompanyDepartmentDao;
import org.hrSolution.model.CompanyDepartmentModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository are the DAOs(Data Access Objects), they access the database directly.
 * */
@Repository("compDeptDao")
@Transactional
public class CompanyDepartmentDaoImpl extends AbstractDao<Integer, CompanyDepartmentModel> implements CompanyDepartmentDao{

	public void saveDepartment(CompanyDepartmentModel compDeptModel) {
		persist(compDeptModel);
		
	}

}
