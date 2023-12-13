package application;

import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

	public static void main(String[] args) {
		/*
		 * RESULTADO NO CONSOLE: 
		 * true
			Joana
			Maria
			Noé
		 * TreeSet<>() --> MANTÉM OS DADOS ORDENADOS
		 */
		Set<String> set = new TreeSet<>();
		set.add("Maria");
		set.add("Noé");
		set.add("Joana");
		
		System.out.println(set.contains("Noé"));
		System.out.println();
		
		for (String sets : set) {
			System.out.println(sets);
		}
	}

}
