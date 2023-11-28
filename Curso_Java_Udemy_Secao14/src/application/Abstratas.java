package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class Abstratas {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Shape> shapes = new ArrayList<>();
		
		int numberShapes = Integer.parseInt(textInput("Enter the number of shapes: "));
		for (int i = 0; i < numberShapes; i++) {
			String choice = textInput("Rectangle or Circle (r/c): ");
			Color color = Color.valueOf(textInput("Color (BLACK/BLUE/RED): "));
			if (choice.equalsIgnoreCase("c")) {
				shapes.add(new Circle(color, Double.parseDouble(textInput("Radius: "))));
			} else if(choice.equalsIgnoreCase("r")){
				shapes.add(new Rectangle(color, Double.parseDouble(textInput("Width: ")), Double.parseDouble(textInput("Height: "))));
			}
		}
		
		System.out.println("SHAPE AREA:");
		for (Shape shape : shapes) {
			System.out.printf("%.2f\n", shape.area());
		}
		
		leitor.close();

	}
	
	public static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
