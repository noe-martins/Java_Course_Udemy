/*
 * ENDEREÇO: // C:\Users\noex_\git\Java_Course_Udemy__POO\Curso_Java_Udemy_Secao19\assets\in.txt
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogUsuario;

/**
 * Classe que lê um conjunto de dados com nome e data de login (name date) em formato .txt
 * e mostra quantos usuários distintos existem no conjunto.
 * 
 * @author noe.martins
 */
public class ProgramExR {
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		//O Set<T> NÃO ACEITA ELEMENTOS REPETIDOS. ESSA É UMA DAS SUAS PRINCIPAIS CARACTERISTICAS
		Set<LogUsuario> logs = new HashSet<>();
		
		String path = textInput("Enter file full path: ");
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] data = line.split(" ");
				Instant date = Instant.parse(data[1]);
				logs.add(new LogUsuario(data[0], date));
				
				line = br.readLine();
			}

			System.out.println("Total users: " + logs.size());
			
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
