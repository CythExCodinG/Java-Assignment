package Service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import Model.Order;

public class OrderProcessor {
	
	
	public static Predicate<Order> validOrder=order->order.getAmount()>50;
		
	
	
	public static Function<Order, Order> incrementdata=
			order->{
				order.setAmount(order.getAmount()*1.1);
				order.setStatus("PROCESSED");
				return order;
			};
			
	public static Consumer<Order> printOrder=order->System.out.println(order);
}
