package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{
	/**
	 * A INTERFACE Comparator<> USA O MÉTODO DE IMPLEMENTAÇÃO compare(T object1, T object2).
	 * COMPARA DOIS OBJETOS NO PARÂMETRO.
	 * USA O MESMO MODELO DO compareTo() NO ALGORÍTIMO DE COMPARAÇÃO E ORDENAÇÃO.
	 * FOI USADO O compareTo() NO return PARA ESPECIFICAR A CONDIÇÃO DE COMPARAÇÃO. 
	 */
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
