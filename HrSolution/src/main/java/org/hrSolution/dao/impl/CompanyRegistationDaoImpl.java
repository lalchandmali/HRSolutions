package org.hrSolution.dao.impl;

import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.CompanyRegistrationDao;
import org.hrSolution.model.CompanyAddress;
import org.hrSolution.model.CompanyRegistrationModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository are the DAOs(Data Access Objects), they access the database directly.
 */
@Repository("companyRegistartionDao")
@Transactional
public class CompanyRegistationDaoImpl extends AbstractDao<Integer, CompanyRegistrationModel> implements CompanyRegistrationDao {

	public void saveCompany(CompanyRegistrationModel companyRegistrationModel, CompanyAddress companyAddress) {
		//persist(companyRegistrationModel);
		companyAddress.setCompanyRegistrationModel(companyRegistrationModel);
		getSession().saveOrUpdate(companyRegistrationModel);
		getSession().saveOrUpdate(companyAddress);
		
	}

}
