package org.hrSolution.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.	bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	@Autowired
	RabbitTemplate rabbitTemplate;
	 @RequestMapping(value = { "/hello" }, method = RequestMethod.GET)
	    public String hello() {
		 System.out.println("*************");
			return "ram ram";

	 }
	 @RequestMapping(value = { "/rabbit" }, method = RequestMethod.GET)
	 public String messageQueue(){
	
	        System.out.println("sending new custom message..");
	        	rabbitTemplate.convertAndSend(new String("RabbitMQ Test Message"));
	        	
	        
		 return "lalchand";
	 }
}
