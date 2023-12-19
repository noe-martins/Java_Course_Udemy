//C:\Users\noex_\git\Java_Course_Udemy__POO\Curso_Java_Udemy_Secao19\assets\candidates.csv
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe de aplicação que lê os dados de um arquivo .csv que contém o nome e quantidade de votos
 * de um candidato e apresenta um relatório com a quantidade total de votos de cada.
 * 
 * @author noe.martins
 */
public class ProgramMapExF {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Map<String, Integer> candidates = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(textInput("Enter file full path: ")))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] filder = line.split(",");
				if (candidates.containsKey(filder[0])) {
					candidates.put(filder[0], candidates.get(filder[0]) + Integer.parseInt(filder[1]));
				} else {
					candidates.put(filder[0], Integer.parseInt(filder[1]));
				}
				line = br.readLine();
			}
			
			for (String candidateName : candidates.keySet()) {
				System.out.println(candidateName + ": " + candidates.get(candidateName));
			}
			
			leitor.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
