package entities;

public class OrderItem {
	private Integer quantity;
	private Product products;
	
	public OrderItem(Integer quantity, Product products) {
		this.quantity = quantity;
		this.products = products;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}
	
	public Double subTotal() {
		return this.products.getPrice() * this.quantity;
	}

	@Override
	public String toString() {
		return this.products.getName() + ", $" + String.format("%.2f", this.products.getPrice()) 
		+ ", Quantity: " + this.quantity + ", Subtotal: $" + String.format("%.2f", this.subTotal());
	}
	
	
}
