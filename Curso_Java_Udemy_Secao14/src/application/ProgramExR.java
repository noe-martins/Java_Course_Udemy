package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramExR {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Employee> employees = new ArrayList<>();
		
		int numberEmployees = Integer.parseInt(textInput("Enter the number of employees: "));
		
		for (int i = 0; i < numberEmployees; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			Boolean validationOutsourced = true;
			while(validationOutsourced) {
				String outsourced = textInput("Outsourced (y/n): ");
				if (outsourced.equalsIgnoreCase("y")) {
					String name = textInput("Name: ");
					Integer hours = Integer.parseInt(textInput("Hours: "));
					Double valuePerHour = Double.parseDouble(textInput("Value per hour: "));
					Double additionalCharge = Double.parseDouble(textInput("Additional charge: "));
					employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
					validationOutsourced = false;
				} else if(outsourced.equalsIgnoreCase("n")) {
					String name = textInput("Name: ");
					Integer hours = Integer.parseInt(textInput("Hours: "));
					Double valuePerHour = Double.parseDouble(textInput("Value per hour: "));
					employees.add(new Employee(name, hours, valuePerHour));
					validationOutsourced = false;
				} else {
					System.out.println("Invalid option, please try again");
				}
			}
		}
		
		System.out.println("\nPAYMENTS:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		leitor.close();

	}
	
	public static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
