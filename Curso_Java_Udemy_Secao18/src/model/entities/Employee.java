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
	 * NESSE CASO FOI FEITO USANDO O MODELO PARA TIPOS PRIMITIVOS, NO CASO O double.
	 * O ALGORÍTIMO INTERNO DO JAVA FAZ TODAS AS COMPARAÇÕES DA LISTA
	 * SEMPRE USA DOIS ATRIBUTOS PARA COMPARAR:
	 * 		- O "this"
	 * 		- O QUE SERÁ DADO NO PARÂMETRO DO MÉTODO
	 */
	@Override
	public int compareTo(Employee others) {
		if (this.salary < others.getSalary()) {
			return -1;
		} else if(this.salary == others.getSalary()){
			return 0;
		} else {
			return 1;
		}
	}
	
	
}
