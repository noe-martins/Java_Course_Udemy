package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class ProgramCuringa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<Product> produtos = new ArrayList<Product>();
		produtos.add(new Product("Sapato", 20.00));
		produtos.add(new Product("Camisa", 10.00));
		printList(produtos);
	}
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
