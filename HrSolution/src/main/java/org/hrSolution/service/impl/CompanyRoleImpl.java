package org.hrSolution.service.impl;

import org.hrSolution.dao.CompanyRoleDao;
import org.hrSolution.model.CompanyRoleModel;
import org.hrSolution.service.CompanyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("compRoleService")
@Transactional
public class CompanyRoleImpl implements CompanyRoleService{

	@Autowired
	CompanyRoleDao compRoleDao;
	public Boolean register(CompanyRoleModel compRoleModel) {
		
		compRoleDao.addRole(compRoleModel);
		return true;
	}

}
