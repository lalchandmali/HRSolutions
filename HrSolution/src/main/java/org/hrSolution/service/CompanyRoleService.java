package org.hrSolution.service;

import org.hrSolution.model.CompanyRoleModel;

public interface CompanyRoleService {

	/**
	 * register method is a abstract method so it does not contains
	 * implementation Implementation will be in CompanyRoleImpl class.
	 */
	Boolean register(CompanyRoleModel compRoleModel);
}
