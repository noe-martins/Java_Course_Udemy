package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramEx3 {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		String name = textInput("Name: ");
		String email = textInput("Email: ");
		LocalDate birthDate = LocalDate.parse(textInput("Birth date (DD/MM/YYYY): "), fmt);
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		LocalDateTime moment = LocalDateTime.now();
		OrderStatus status = OrderStatus.valueOf(textInput("Status: "));
		Order order = new Order(moment, status);
		client.setOrder(order);
		
		int manyItems = Integer.parseInt(textInput("How many items to this order: "));
		for (int i = 0; i < manyItems; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			String nameProduct = textInput("Product name: ");
			Double price = Double.parseDouble(textInput("Product price: "));
			Integer quantity = Integer.parseInt(textInput("Quantity: "));
			Product product = new Product(nameProduct, price);
			OrderItem orderItem = new OrderItem(quantity, product);
			order.addItens(orderItem);
		}
		
		System.out.println();
		System.out.println(client);
		
		leitor.close();
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
