package entities;

import java.util.Objects;

/*
 * AQUI DIZ QUE SE UM OBJETO DO TIPO "Product" FOR CRIADO, ELE TEM PERMISSÃO PARA USAR O CONTRATO DA INTERFACE "Comparable<>".
 */
public class Product implements Comparable<Product>{
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	/*
	 * AQUI DIZ ESPECIFICA O QUE É A "COMPARAÇÃO" PARA UM OBJETO DO TIPO "Product".
	 * NO CASO É O ATRIBUTO "price".
	 * COMO "price" É UMA VARIÁVEL DO TIPO Double, ENTÃO DÁ PARA USAR O "compareTo()" DIRETAMENTE.
	 */
	@Override
	public int compareTo(Product others) {
		return this.price.compareTo(others.getPrice());
	}

	@Override
	public String toString() {
		return this.name + ", " + String.format("%.2f", this.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	
}
