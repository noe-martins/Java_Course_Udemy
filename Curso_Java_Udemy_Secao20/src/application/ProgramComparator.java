package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProgramComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/**
		 * O "sort()" USA COMO PARÂMETRO UM Comparator<T>
		 * NESSE CASO FOI CRIADO UMA CLASSE QUE IMPLEMENTA ESSA INTERFACE E INSTANCIADO DIRETAMENTE NO PARÂMETRO
		 */
		list.sort(new MyComparator());
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
