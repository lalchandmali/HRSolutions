package org.hrSolution.dao.impl;

import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.CompanyRoleDao;
import org.hrSolution.model.CompanyRoleModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("compRoleDao")
@Transactional
public class CompanyRoleDaoImpl extends AbstractDao<Integer, CompanyRoleModel> implements CompanyRoleDao{
	
	public void addRole(CompanyRoleModel compRoleModel) {
		persist(compRoleModel);
		
	}

}
