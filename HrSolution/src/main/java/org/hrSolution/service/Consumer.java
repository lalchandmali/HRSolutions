package org.hrSolution.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class Consumer implements MessageListener{

	public void onMessage(Message message) {
		 System.out.println("got message"+new String(message.getBody()));
		
	}

}
