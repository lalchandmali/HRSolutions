package org.hrSolution.service;

import org.hrSolution.model.CompanyAddress;
import org.hrSolution.model.CompanyRegistrationModel;

public interface CompanyRegistrationService {
	
	/**
	 * register method is a abstract method so it does not contains
	 * implementation Implementation will be in CompanyRegistrationImpl class.
	 * */
	boolean registerCompany(CompanyRegistrationModel companyRegistrationModel, CompanyAddress companyAddress);
}
