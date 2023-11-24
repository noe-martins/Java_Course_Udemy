package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramExF {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		leitor = new Scanner(System.in);
		List<Product> products = new ArrayList<>();

		int numberProduct = Integer.parseInt(textInput("Enter the number of product: "));
		for (int i = 0; i < numberProduct; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			boolean validator = true;
			while (validator) {
				String typeProduct = textInput("Common, used or imported (c/u/i): ");
				if (typeProduct.equalsIgnoreCase("c")) {
					String name = textInput("Name: ");
					Double price = Double.parseDouble(textInput("Price: "));
					products.add(new Product(name, price));
					validator = false;
				} else if(typeProduct.equalsIgnoreCase("i")) {
					String name = textInput("Name: ");
					Double price = Double.parseDouble(textInput("Price: "));
					Double customFee = Double.parseDouble(textInput("Customs fee: "));
					products.add(new ImportedProduct(name, price, customFee));
					validator = false;
				} else if(typeProduct.equalsIgnoreCase("u")) {
					String name = textInput("Name: ");
					Double price = Double.parseDouble(textInput("Price: "));
					boolean validatorDateIntern = true;
					while(validatorDateIntern) {
						String date = textInput("Manufacture date (DD/MM/YYYY): ");
						DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						if(validatorDate(date, fmt)) {
							LocalDate manufactureDate = LocalDate.parse(date, fmt);
							products.add(new UsedProduct(name, price, manufactureDate));
							validatorDateIntern = false;
						} else {
							System.out.println("Invalid date. Please retype");
						}
					}
					validator = false;
				}
			}
		}
		
		//IMPRESSÃO
		System.out.println("\nPRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		leitor.close(); 
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
	private static Boolean validatorDate(String date, DateTimeFormatter fmt) {
		try {
			LocalDate manufactureDate = LocalDate.parse(date, fmt);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

}
