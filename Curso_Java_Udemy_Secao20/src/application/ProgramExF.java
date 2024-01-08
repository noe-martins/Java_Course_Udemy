// /home/noah/Documentos/Curso Udemy Java/Java_Course_Udemy/Curso_Java_Udemy_Secao20/assets/Fixacao.csv
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class ProgramExF {
	
	private static Scanner leitor;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(textInput("Enter full file path: ")))){
			String line = br.readLine();
			
			while(line != null) {
				String[] filder = line.split(",");
				employees.add(new Employee(filder[0], filder[1], Double.parseDouble(filder[2])));
				line = br.readLine();
			}
			
			//FILTRO POR SALÁRIO
			Double salaryFilter = Double.parseDouble(textInput("Enter salary: "));
			List<String> emailsFilters = employees.stream()
					.filter(e -> e.getSalary() > salaryFilter)
					.map(e -> e.getEmail())
					.collect(Collectors.toList());
			emailsFilters.sort((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()));
			emailsFilters.forEach(System.out::println);
			
			//FILTRO POR NOMES COM INICIAIS COM A LETRA 'M'
			double sumSalaryFilter = employees.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.printf("Sum of alary of people whose name starts with 'M': %.2f", sumSalaryFilter);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
