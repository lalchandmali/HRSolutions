package org.hrSolution.service.impl;

import org.hrSolution.dao.CompanyDepartmentDao;
import org.hrSolution.model.CompanyDepartmentModel;
import org.hrSolution.service.CompanyDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("compDeptService")
@Transactional
public class CompanyDepartmentImpl implements CompanyDepartmentService{

	@Autowired
	CompanyDepartmentDao compDeptDao;
	
	/**
	 * This is the implementation class of Service class and it provides
	 * implementation of all method of service class.
	 * 
	 **/
	public Boolean addDepartment(CompanyDepartmentModel compDeptModel) {
		
		compDeptDao.saveDepartment(compDeptModel);
		return true;
	}

}
