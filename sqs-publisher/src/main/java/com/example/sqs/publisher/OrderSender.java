package com.example.sqs.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.amazonaws.services.sqs.AmazonSQSAsync;

@Service
public class OrderSender {
	
	private final QueueMessagingTemplate queueMessagingTemplate;

	@Autowired
	public OrderSender(AmazonSQSAsync amazonSqs) {
		this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSqs);
	}

	public void send(Order order) {
		this.queueMessagingTemplate.send("sqs-spring-boot-demo", MessageBuilder.withPayload(order).build());
	}
}
