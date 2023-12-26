package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class ProgramPredicate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*
		 * LÊ-SE:
		 * ESSE Predicate IRÁ RECEBER UMA FUNÇÃO ANÔNIMA QUE RECEBE COMO ARGUMENTO UM OBJETO Product
		 * QUE RETORNARÁ UM boolean BASEADO NO PREÇO MAIOR QUE A VARIÁVEL "min"
		 */
		double min = 100.00;
		Predicate<Product> prod = p -> p.getPrice() >= min;
		list.removeIf(prod);
		
		for (Product product : list) {
			System.out.println(product);
		}
	}

}
