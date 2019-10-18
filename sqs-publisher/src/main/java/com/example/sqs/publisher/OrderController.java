package com.example.sqs.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

	@Autowired
	private OrderSender orderSender;
	
	@RequestMapping("random")
	public Order order() {
		Order order = Order.randomInstance();
		orderSender.send(order);
		return order;
	}
	
}
