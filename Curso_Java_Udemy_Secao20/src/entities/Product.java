package entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

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
	 * COMO O MÉTODO AGORA NÃO É ESTÁTICO, IRÁ USAR OS ATRIBUTOS DO PRÓPRIO OBJETO.
	 * ISSO PORQUE AGORA O MÉTODO RODARÁ NO 'HEAP' DA MEMÓRIA
	 */
	public boolean nonStaticProductPredicate() {
		return this.price >= 100.00;
	}
	
	public static void staticProductConsumer(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticProductConsumer() {
		this.price *= 1.1;
	}
	
	public static String staticProductFunction(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticProductFunction() {
		return this.name.toUpperCase();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]\n";
	}
}
