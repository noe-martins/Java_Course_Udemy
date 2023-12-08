package application;

import java.util.Scanner;

import model.service.PrintService;

public class ProgramPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values: ");
		int manyValues = sc.nextInt();
		
		PrintService ps = new PrintService();
		for (int i = 0; i < manyValues; i++) {
			ps.addValue(sc.nextInt());
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
