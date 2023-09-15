package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class ProgramPOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter com as dimensões do triângulo X:");
		x.setLadoA(sc.nextDouble());
		x.setLadoB(sc.nextDouble());
		x.setLadoC(sc.nextDouble());
		
		System.out.println("Enter com as dimensões do triângulo Y:");
		y.setLadoA(sc.nextDouble());
		y.setLadoB(sc.nextDouble());
		y.setLadoC(sc.nextDouble());
		
		sc.close();
		
		//Condição para descobrir triângulo maior
		String large = (x.area() > y.area()) ? "X": "Y";
				
		System.out.printf("Triângulo X tem área: %.4f\n", x.area());
		System.out.printf("Triângulo Y tem área: %.4f\n", y.area());
		System.out.println("Maior triângulo: " + large);

	}

}
