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
		
	}
	public static Double totalArea(List<Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	/*
	 * PROBLEMA: SE FOR CRIAR UMA List<Circle>, NÃO VAI DÁ PRA USAR O "totalArea()", POIS Circle PODE SER UM SUBTIPO DE Shape, 
	 * MAS List<Circle> NÃO É UM SUBTIPO DE List<Shape>.
	 */
}
