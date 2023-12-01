package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramModel_1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File file = new File("C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao17\\assets\\Texto.txt");
		//COLOCA "null" PARA ONDE O SCANNER ESTÁ APONTANDO
		Scanner sc = null;
		try {
			//INSTANCIA NA MEMÓRIA HEAP O DESTINO DO ARQUIVO
			sc = new Scanner(file);
			//ENQUANTO ESTIVER ALGO NA OUTRA LINHA DA ENTRADA DO SCANNER, O LOOP CONTINUA VERDADEIRO
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			//QUANDO O SCANNER ABRIR O ARQUIVO, PODE SER QUE POSSA DAR ERRO DE I/O, POR ISSO O "IOException"
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		long elapsed = System.currentTimeMillis() - start;
		System.out.printf("%.3f s\n", (elapsed / 1000d));

	}

}
