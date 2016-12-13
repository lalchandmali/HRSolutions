package org.hrSolution.service;

import org.hrSolution.model.HrSolutionsDocToFillModel;

public interface WordTemplateService {
	/**
	 * This method is used to fill document template by information provided by pre employee
	 * @return boolean 
	 * @return true if successfully filled document template
	 * otherwise @return false if any exception or error occurred
	 * 
	 * */
boolean employeeDocFill(HrSolutionsDocToFillModel hrSolutionsDocToFillModel);
}
