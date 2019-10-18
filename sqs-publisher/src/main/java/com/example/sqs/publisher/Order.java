package com.example.sqs.publisher;

import java.math.BigDecimal;
import java.util.Random;

public class Order {

	private int id;
	private String description;
	private BigDecimal amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public static Order randomInstance() {
		Random random=new Random();
		Order order = new Order();
		order.id = random.nextInt();
		order.amount = new BigDecimal(random.nextDouble());
		order.description = "Random description: " + random.nextLong();	
		return order;
	}
	
}
