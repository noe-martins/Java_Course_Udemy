package application;


import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramEx1 {
	
	private static Scanner leitor;
	private static HourContract contracts;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		//ENTRADA DE DADOS INICIAIS
		Department department = new Department(textInput("Enter department's name: "));
		System.out.println("Enter worker data:");
		String name = textInput("Name: ");
		WorkerLevel level = WorkerLevel.valueOf(textInput("Level: "));
		Double baseSalary = Double.parseDouble(textInput("Base salary: "));
		Worker worker = new Worker(name, level, baseSalary, department);
		
		//ENTRADA DE DADOS DE CADA CONTRATO
		int manyContract = Integer.parseInt(textInput("How many contracts to this worker: "));
		for (int i = 0; i < manyContract; i++) {
			System.out.println("Enter contract #" + i + " data:");
			String date = textInput("Date (DD/MM/YYYY): ");
			Double valuePerHour = Double.parseDouble(textInput("Value per hour: "));
			Integer duration = Integer.parseInt(textInput("Duration (hours): "));
			contracts = new HourContract(date, valuePerHour, duration);
			worker.addContract(contracts);
		}
		
		System.out.println();
		
		String dateIncome = textInput("Enter month and year to calculate income (MM/YYYY): ");
		//LocalDate dateIncomeConvert = LocalDate.parse(dateIncome, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String[] numeros = dateIncome.split("/");
		Integer month = Integer.parseInt(numeros[0]);
		Integer year = Integer.parseInt(numeros[1]);
		//worker.income(month, year);
		Double valorHoraTotal = worker.income(month, year);
		Double baseSalaryTotal = worker.getBaseSalary();
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departmente: " + worker.getNameDepartment().getName());
		System.out.println("Income for " + dateIncome + ": " + (valorHoraTotal + baseSalaryTotal) );
		
	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
	
}
