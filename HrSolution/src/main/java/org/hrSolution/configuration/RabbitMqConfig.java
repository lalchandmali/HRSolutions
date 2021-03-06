/**
 * @author lalchand mali
 * */

package org.hrSolution.configuration;


import org.hrSolution.service.Consumer;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.support.converter.JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.hrSolution.configuration" })
public class RabbitMqConfig {
	 private static final String SIMPLE_MESSAGE_QUEUE = "jmsQueue";

	    @Bean
	    public ConnectionFactory connectionFactory() {
	        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
	        connectionFactory.setUsername("guest");
	        connectionFactory.setPassword("guest");
	        return connectionFactory;
	    }

	    @Bean
	    public Queue simpleQueue() {
	        return new Queue(SIMPLE_MESSAGE_QUEUE);
	    }

	    @Bean
	    public MessageConverter jsonMessageConverter(){
	        return new JsonMessageConverter();
	    }

	    @Bean
	    public RabbitTemplate rabbitTemplate() {
	        RabbitTemplate template = new RabbitTemplate(connectionFactory());
	        template.setRoutingKey(SIMPLE_MESSAGE_QUEUE);
	        template.setMessageConverter(jsonMessageConverter());
	        return template;
	    }

	    @Bean
	    public SimpleMessageListenerContainer listenerContainer() {
	        SimpleMessageListenerContainer listenerContainer = new SimpleMessageListenerContainer();
	        listenerContainer.setConnectionFactory(connectionFactory());
	        listenerContainer.setQueues(simpleQueue());
	        listenerContainer.setMessageConverter(jsonMessageConverter());
	        listenerContainer.setMessageListener(new Consumer());
	        listenerContainer.setAcknowledgeMode(AcknowledgeMode.AUTO);
	        return listenerContainer;
	    }

}
