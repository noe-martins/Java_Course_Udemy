package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramComparable {

	public static void main(String[] args) {
		
		List<String> pessoas = new ArrayList<>();
		String path = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao18\\assets\\names.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				pessoas.add(line);
				line = br.readLine();
			}
			/*
			 * O método Collections.sort(List<T> list) é capaz de ordenar uma lista de objetos de qualquer classe que 
			 * implemente a interface Comparable. No caso das Strings, a classe String já implementa a interface Comparable, 
			 * o que permite que ela seja ordenada naturalmente com base na ordem lexicográfica.
			 */
			Collections.sort(pessoas);
			for (String names : pessoas) {
				System.out.println(names);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
