package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

public class Program {

	private static Scanner leitor;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		
		Shape rectangle = new Rectangle(Color.BLACK, 5.0, 3.0);
		Shape circle = new Circle(Color.WHITE, 2.0);
		
		System.out.println(rectangle);
		System.out.println(circle);

	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
