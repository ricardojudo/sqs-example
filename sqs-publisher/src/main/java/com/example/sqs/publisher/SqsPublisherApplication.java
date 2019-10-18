package com.example.sqs.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SqsPublisherApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SqsPublisherApplication.class, args);
		OrderSender orderSender = context.getBean(OrderSender.class);
		orderSender.send(Order.randomInstance());
		
	}

}
