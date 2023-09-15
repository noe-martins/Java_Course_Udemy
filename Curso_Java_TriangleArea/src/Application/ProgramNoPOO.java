package Application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNoPOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter com as dimensões do triângulo X:");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		
		System.out.println("Enter com as dimensões do triângulo Y:");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		//Calculo do p dos dois triângulos
		double p1 = (x1 + x2 + x3)/2;
		double p2 = (y1 + y2 + y3)/2;
		
		//Calculo da Area dos dois triângulos
		double a1 = Math.sqrt(p1*(p1 - x1)*(p1 - x2)*(p1 - x3));
		double a2 = Math.sqrt(p2*(p2 - y1)*(p2 - y2)*(p2 - y3));
		
		sc.close();
		
		//Condição para descobrir triângulo maior
		String large = (a1 > a2) ? "X": "Y";
		
		System.out.printf("Triângulo X tem área: %.4f\n", a1);
		System.out.printf("Triângulo Y tem área: %.4f\n", a2);
		System.out.println("Maior triângulo: " + large);

	}

}
