package org.hrSolution.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hrSolution.dao.CompanyRoleDao;
import org.hrSolution.model.CompanyRoleModel;
import org.hrSolution.service.CompanyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Abhimanyu Baranwal
 *
 */

@Service("compRoleService")
@Transactional
public class CompanyRoleImpl implements CompanyRoleService {

<<<<<<< HEAD
	private static final Logger logger = LogManager.getLogger(CompanyDepartmentImpl.class);
	@Autowired
	CompanyRoleDao compRoleDao;

=======
	private static final Logger logger = LogManager
			.getLogger(CompanyDepartmentImpl.class);
	@Autowired
	CompanyRoleDao compRoleDao;
	
>>>>>>> 78bc347a4a65a3cfdf42343904bba89092767193
	/**
	 * This is the implementation class of Service class and it provides
	 * implementation of all method of service class.
	 * 
<<<<<<< HEAD
	 */
	public Boolean register(CompanyRoleModel compRoleModel) {

=======
	 * */
	public Boolean register(CompanyRoleModel compRoleModel) {
		
		
>>>>>>> 78bc347a4a65a3cfdf42343904bba89092767193
		try {
			compRoleDao.addRole(compRoleModel);
		} catch (Exception exception) {
			logger.debug("Exception occured " + exception);
			return false;
		}
		return true;
	}

}
