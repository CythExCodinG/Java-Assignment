package com.main;

import java.util.Arrays;
import java.util.List;

import Model.Order;
import Service.OrderProcessor;

public class Main {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
                new Order(101, 100, "PENDING"),
                new Order(102, 40, "PENDING"),
                new Order(103, 250, "PENDING"),
                new Order(104, 30, "PENDING"),
                new Order(105, 500, "PENDING")
        );
		
		for (Order order : orders) {
			if(OrderProcessor.validOrder.test(order)) {
				Order processedOrder=OrderProcessor.incrementdata.apply(order);
				
				OrderProcessor.printOrder.accept(processedOrder);
			}
		}
	}
}
