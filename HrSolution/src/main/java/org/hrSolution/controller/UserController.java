package org.hrSolution.controller;

import org.hrSolution.model.UserLoginModel;
import org.hrSolution.service.UserLoginService;
import org.hrSolution.service.redis.RedisService;
import org.hrSolution.status.constant.RedisTemplateConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	RedisService redisService;
	@Autowired
	UserLoginService userLoginService;
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Object> userLogin(@RequestBody UserLoginModel userLoginModel){
		boolean status=userLoginService.userLogin(userLoginModel);
		return null;
	}
	@RequestMapping(value = "/duration", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Object> duration(@RequestParam int userId){
		
		/**
		 * getting value from redis cache
		 * */
		Object obj1 = redisService.getValue(userId+"");
		System.out.println(obj1);
		return null;
	}
}
