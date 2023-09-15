package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Retangle;

public class RectangleArea {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		Retangle rectangle = new Retangle();
		
		System.out.println("Enter rectangle widht and height:");
		rectangle.setWidth(leitor.nextDouble());
		rectangle.setHeight(leitor.nextDouble());
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.Area()));
		System.out.println("PERIMETER = " + String.format("%.2f",rectangle.Perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f",rectangle.Diagonal()));
	}

}
