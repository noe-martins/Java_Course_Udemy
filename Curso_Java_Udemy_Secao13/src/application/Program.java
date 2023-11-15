package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order pedido = new Order(25, LocalDateTime.now(), OrderStatus.PENDIND_PAYMENT);
		System.out.println(pedido);
		
		//CONVERSÃO DE String PARA ENUM
		OrderStatus os = OrderStatus.valueOf("DELIVERED");
		System.out.println(os);

	}

}
