package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class ProgramMapDemo2 {

	public static void main(String[] args) {
		Map<Product, Integer> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.00);
		Product p2 = new Product("Notebook", 1200.00);
		Product p3 = new Product("Tablet", 400.00);
		
		stock.put(p1, 1500);
		stock.put(p2, 20000);
		stock.put(p3, 3600);
		
		Product ps = new Product("Tv", 900.00);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
