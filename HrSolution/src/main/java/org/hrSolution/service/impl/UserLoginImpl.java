package org.hrSolution.service.impl;

import org.hrSolution.dao.UserLoginDao;
import org.hrSolution.model.UserLoginModel;
import org.hrSolution.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userLoginService")
public class UserLoginImpl implements UserLoginService{

	@Autowired
	UserLoginDao userLoginDao;
	public boolean userLogin(UserLoginModel userLoginModel) {
		
		try{
		boolean status=userLoginDao.getUser(userLoginModel);
		}catch(Exception ex){
			ex.getMessage();
		}
		
		return false;
	}

}
