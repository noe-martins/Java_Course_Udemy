package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class ProductRegistration {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		Product produtoA = new Product();
		
		System.out.println("Enter product data:");
		produtoA.setName(textInput("Name: "));
		produtoA.setPrice(Double.parseDouble(textInput("Price: ")));
		produtoA.setQuantity(Integer.parseInt(textInput("Quantity in stock: ")));
		
		//Dados do Produto
		System.out.println("\n" + produtoA.toStringInitial());
		
		//Entrada no Estoque
		produtoA.AddProducts(Integer.parseInt(textInput("\nEnter the number of products to be added in stock: ")));
		System.out.println("\n" + produtoA); //Não precisa chamar o .toString(). O Java já reconhece isso pelo println()
		
		//Saída no Estoque
		produtoA.RemoveProducts(Integer.parseInt(textInput("\nEnter the number of products to be removed from stock: ")));
		System.out.println("\n" + produtoA);
		
	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}


}
