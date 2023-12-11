package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.service.CalculationService;

public class ProgramMaxProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao19\\assets\\produtos.csv";
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] filders = line.split(",");
				products.add(new Product(filders[0], Double.parseDouble(filders[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(products);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
