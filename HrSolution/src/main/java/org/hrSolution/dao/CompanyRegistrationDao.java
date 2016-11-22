package org.hrSolution.dao;

import org.hrSolution.model.CompanyAddress;
import org.hrSolution.model.CompanyRegistrationModel;

/**
 * Interface for registering company
 */
public interface CompanyRegistrationDao {

	void saveCompany(CompanyRegistrationModel companyRegistrationModel, CompanyAddress companyAddress);
}
