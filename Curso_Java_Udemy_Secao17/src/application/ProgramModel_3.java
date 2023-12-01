package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramModel_3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String path = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao17\\assets\\Texto.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		long elapsed = System.currentTimeMillis() - start;
		System.out.printf("%.3f s\n", (elapsed / 1000d));
	}

}
