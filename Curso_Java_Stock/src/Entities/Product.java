package Entities;

public class Product {
	//Attributes
	private String name;
	private double price;
	private int quantity;
	
	//Special Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Methods
	public String TotalValueInStock() {
		double total = this.getPrice() * this.getQuantity();
		return String.format("%.2f", total);
	}
	public void AddProducts(int quantity) {
		this.setQuantity(this.getQuantity() + quantity);
	}
	public void RemoveProducts(int quantity) {
		this.setQuantity(this.getQuantity() - quantity);
	}
	
	//A toString() é um método da classe Object() e por isso que se usa @Override, para sobrepor a classe toString() lá na classe super
	@Override
	public String toString() {
		return "Update data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + TotalValueInStock();
	}// Usado o .format() para trazer uma String formatada
	
	public String toStringInitial() {
		return "Product data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ " + TotalValueInStock();
	}
	
	
	
}
