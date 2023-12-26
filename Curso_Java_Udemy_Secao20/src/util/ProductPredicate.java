package util;

import java.util.function.Predicate;

import entities.Product;

/*
 * ESSA CLASSE IMPLEMENTA O CONTRATO DA INTERFACE Predicate<T>.
 */
public class ProductPredicate implements Predicate<Product>{
	
	/*
	 * ESSE MÉTODO ABSTRATO RECEBE COMO PARÂMETRO UM OBJETO Product
	 * E RETORNA UM boolean CASO O PREÇO DESSE Product SEJA MAIOR OU IGUAL A 100.00
	 */
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}
	
}
