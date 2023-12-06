package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import model.entities.Employee;

public class ProgramComparableCSV {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Employee> employees = new ArrayList<Employee>();
		String path = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao18\\assets\\funcionarios.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] files = line.split(",");
				employees.add(new Employee(files[0], Double.parseDouble(files[1])));
				line = br.readLine();
			}
			
			Collections.sort(employees);
			for (Employee employee : employees) {
				System.out.println(employee.getName() + "," + String.format("%.2f", employee.getSalary()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
