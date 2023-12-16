package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Classe de aplicação que cadastra o código de alunos em três turmas (A,B e C)
 * e mostra quantos alunos distintos tem no total.
 * 
 * @author noe.martins
 */
public class ProgramExF {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		Set<Integer> studentsCode = new HashSet<>();
		
		addManyStudents("A", studentsCode);
		addManyStudents("B", studentsCode);
		addManyStudents("C", studentsCode);
		
		System.out.println("Total students: " + studentsCode.size());
		
		leitor.close();
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
	/**
	 * 
	 * @param classes, que contém o nome da turma
	 * @param studentsCode, que contém a lista de códigos de cada estudante
	 */
	private static void addManyStudents(String classes, Set<Integer> studentsCode) {
		int manyStudents = Integer.parseInt(textInput("How many students for course " + classes + "?"));
		for (int i = 0; i < manyStudents; i++) {
			studentsCode.add(Integer.parseInt(textInput("")));
		}
	}
}
