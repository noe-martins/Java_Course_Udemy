package application;

import java.util.Scanner;

import model.service.PrintService;

/*
 * SOLUÇÃO:
 * - REAPROVEITEI A CLASSE PrintService PARA DIFERENTE TIPOS
 */

public class ProgramPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values: ");
		int manyValues = sc.nextInt();
		
		//FALEI QUE ESSE OBJETO VAI SER DO TIPO "Integer"
		System.out.println("Numbers: ");
		PrintService<Integer> psInteger = new PrintService<>();
		for (int i = 0; i < manyValues; i++) {
			psInteger.addValue(sc.nextInt());
		}
		
		System.out.println("Names: ");
		sc.nextLine();//TIRANDO O BUFFER
		PrintService<String> psString = new PrintService<>();
		for (int i = 0; i < manyValues; i++) {
			psString.addValue(sc.nextLine());
		}
		
		System.out.println("Numbers");
		psInteger.print();
		System.out.println("First: " + psInteger.first());
		
		System.out.println("\nNames");
		psString.print();
		System.out.println("First: " + psString.first());
		
		sc.close();

	}

}
