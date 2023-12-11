package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import model.enums.Color;

public class ProgramCuringaDilimitado {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(Color.BLACK, 3.0, 2.0));
		myShapes.add(new Circle(Color.WHITE, 4.0));
		System.out.println("Total area: " + totalArea(myShapes));
		
		List<Circle> myCircles = new ArrayList<Circle>();
		myCircles.add(new Circle(Color.BLACK, 2.0));
		myCircles.add(new Circle(Color.BLACK, 4.0));
		System.out.println("Total area: " + totalArea(myCircles));
		
	}
	/*
	 * (List<? extends Shape> list), LÊ-SE: ESSE MÉTODO RECEBE COMO PARÂMETRO UMA List DE QUALQUER TIPO QUE INCLUSIVE PODE SER QUALQUER 
	 * SUBTIPO DA CLASSE Shape.
	 */
	public static Double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
