package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {
		/*
		 * LinkedHashSet<>() --> MANTÉM A ORDEM EM QUE OS DADOS FORAM INSERIDOS
		 */
		Set<String> set = new LinkedHashSet<>();
		set.add("Maria");
		set.add("Noé");
		set.add("Joana");
		
		//REMOVER ITEM
		set.remove("Maria");
		
		for (String sets : set) {
			System.out.println(sets);
		}
		
		//REMOVER ITEM COM UM PREDICADO (CONDIÇÃO)
		System.out.println();
		set.removeIf(x -> x.length() > 3); //TAMANHO DA String MAIOR QUE 3 CARACTERES
		
		for (String sets : set) {
			System.out.println(sets);
		}
	}

}
