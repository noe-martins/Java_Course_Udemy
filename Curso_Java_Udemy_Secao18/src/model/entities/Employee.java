package model.entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	/*
	 * NESSE CASO FOI FEITO USANDO O MODELO PARA WRAPPERS, NO CASO O STRING.
	 * O ALGORÍTIMO INTERNO DO JAVA FAZ TODAS AS COMPARAÇÕES DA LISTA
	 * SEMPRE USA DOIS ATRIBUTOS PARA COMPARAR:
	 * 		- O "this"
	 * 		- O QUE SERÁ DADO NO PARÂMETRO DO MÉTODO
	 * PELO FATO DE OS WRAPPERS JÁ TEREM IMPLEMENTADO EM SUAS CLASSES A INTERFACE Comparable, JÁ PODE USAR O MÉTODO compareTo DIRETAMENTE
	 */
	@Override
	public int compareTo(Employee others) {
		return this.name.compareTo(others.getName());
	}
	
	
}
