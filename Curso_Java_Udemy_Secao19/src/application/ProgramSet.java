package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {
		/*
		 * RESULTADO NO CONSOLE: 
		 * true
			Noé
			Joana
			Maria
		 * HashSet<>() --> NÃO LEVA EM CONTA A ORDENAÇÃO DA LISTA
		 */
		Set<String> set = new HashSet<>();
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
