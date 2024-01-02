// /home/noah/Documentos/Curso Udemy Java/Java_Course_Udemy/Curso_Java_Udemy_Secao20/assets/in.txt
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class ProgramExR {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(textInput("Enter full file path: ")))){
			String line = br.readLine();
			
			while(line != null) {
				String[] filders = line.split(",");
				products.add(new Product(filders[0], Double.parseDouble(filders[1])));
				line = br.readLine();
			}
			
			List<Double> prices = products.stream().map(p -> p.getPrice()).collect(Collectors.toList());
			double averagePrices = prices.stream().reduce(0.0, (x, y) -> (x + y)) / prices.size();
			
			List<String> selectorProducts = products.stream().filter(p -> p.getPrice() < averagePrices).map(p -> p.getName()).collect(Collectors.toList());
			selectorProducts.sort((p1, p2) -> p2.toUpperCase().compareTo(p1.toUpperCase()));
			
			System.out.println("Average price: " + String.format("%.2f", averagePrices));
			selectorProducts.forEach(System.out::println);
			
			leitor.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
