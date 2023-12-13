package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {
		/*
		 * RESULTADO NO CONSOLE: 
		 * true
			Joana
			Maria
			Noé
		 * LinkedHashSet<>() --> MANTÉM A ORDEM EM QUE OS DADOS FORAM INSERIDOS
		 */
		Set<String> set = new LinkedHashSet<>();
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
