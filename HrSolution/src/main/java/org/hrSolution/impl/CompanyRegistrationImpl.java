package org.hrSolution.impl;

import org.hrSolution.dao.CompanyRegistrationDao;
import org.hrSolution.model.CompanyAddress;
import org.hrSolution.model.CompanyRegistrationModel;
import org.hrSolution.service.CompanyRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("companyRegistrationService")
@Transactional
public class CompanyRegistrationImpl implements CompanyRegistrationService {

	@Autowired
	CompanyRegistrationDao companyRegistrationDao;

	/**
	 * This is the implementation class of Service class and it provides
	 * implementation of all method of service class.
	 * 
	 */
	public boolean registerCompany(CompanyRegistrationModel companyRegistrationModel, CompanyAddress companyAddress) {
		companyRegistrationDao.saveCompany(companyRegistrationModel, companyAddress);
		return true;
	}

}
