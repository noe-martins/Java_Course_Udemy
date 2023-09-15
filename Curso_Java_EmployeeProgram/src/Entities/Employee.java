package Entities;

public class Employee {
	//Attributes
	private String name;
	private double grossSalary, tax;
	
	//Special Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	//Methods
	public double NetSalary() {
		return (this.getGrossSalary() - this.getTax());
	}
	public void IncreaseSalary(double percentage) {
		this.setGrossSalary(((percentage/100) + 1) * this.getGrossSalary());
	}
	
	@Override
	public String toString() {
		return "Update data: " + name + ", $ " + String.format("%.2f", NetSalary());
	}
	
	
}
