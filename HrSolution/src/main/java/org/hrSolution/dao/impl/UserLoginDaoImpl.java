package org.hrSolution.dao.impl;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hrSolution.dao.AbstractDao;
import org.hrSolution.dao.UserLoginDao;
import org.hrSolution.model.UserLoginModel;
import org.hrSolution.service.redis.RedisService;
import org.hrSolution.status.constant.RedisTemplateConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userLoginDao")
@Transactional
public class UserLoginDaoImpl extends AbstractDao<Integer, UserLoginModel> implements UserLoginDao{
	@Autowired
	RedisService redisService;
	public boolean getUser(UserLoginModel userLoginModel) {
		
		UserLoginModel obj=getByKey(userLoginModel.getUserId());
		ObjectMapper objectMapper=new ObjectMapper();
		String user;
		try {
			user = objectMapper.writeValueAsString(userLoginModel);
			if(userLoginModel.getUserId()==obj.getUserId() && userLoginModel.getPassword().equals(obj.getPassword())){
				/**
				 * Saving registration object into Redis cache server
				 * */
				DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			       Date dateobj = new Date();
			       
				redisService.setValue(userLoginModel.getUserId()+"", df.format(dateobj));
				/**
				 * getting value from redis cache
				 * */
				Object obj1 = redisService.getValue(userLoginModel.getUserId()+"");
			}
			
			System.out.println(obj.toString());
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

}
