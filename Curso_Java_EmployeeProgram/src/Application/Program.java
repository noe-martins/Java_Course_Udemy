package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		Employee employee = new Employee();
		
		employee.setName(textInput("Name: "));
		employee.setGrossSalary(Double.parseDouble(textInput("Gross salary: ")));
		employee.setTax(Double.parseDouble(textInput("Tax: ")));
		
		System.out.println("\nEmployee: " + employee.getName() + ", $ " + String.format("%.2f", employee.NetSalary()));
		employee.IncreaseSalary(Double.parseDouble(textInput("\nWhich percentage to incease salary? ")));
		System.out.println("\n" + employee.toString());
		
	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
