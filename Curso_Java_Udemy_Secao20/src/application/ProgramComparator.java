package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class ProgramComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/**
		 * LÊ-SE: p1 E p2 LEVANDO A UMA IMPLEMENTAÇÃO DE FUNÇÃO.
		 * ISSO É UMA FUNÇÃO LAMBDA.
		 * (p1, p2) --> SÃO OS PARÂMETROS DA FUNÇÃO.
		 * ->, INDICANDO O QUE SERÁ IMPLEMENTADO NO CORPO DA FUNÇÃO DADA POR ENTRE {};
		 * 
		 * OBS:
		 * 1) NÃO PRECISOU ESPECIFICAR O TIPO DE p1 E p2. O COMPILADOR JÁ INTERPRETA QUE É DO TIPO PASSADO NO Comparator<Product>
		 * 2) MAIS UM VEZ: NÃO ESTÁ SENDO INSTACIADO UMA INTERFACE, MAS SIM A CRIAÇÃO DE UMA CLASSE ANÔNIMA COM O USO DE FUNÇÃO LAMBDA
		 */
		
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
