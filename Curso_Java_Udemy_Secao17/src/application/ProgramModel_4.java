package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramModel_4 {

	public static void main(String[] args) {
		String[] lines = new String[] {"Maçã", "Uva", "Pêra"};
		
		String path = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao17\\assets\\feira.txt";
		
		/*
		 * "new FileWriter(path,true)" 
		 * PRIMEIRO PARÂMETRO É UMA STRING CONTENDO O CAMINHO DO ARQUIVO
		 * SEGUNDO PARÂMETRO É UM BOOLEANO QUE INDICA SE OS DADOS GRAVADOS DEVEM SER ANEXADOS OU NÃO
		 */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for (int i = 0; i < lines.length; i++) {
				bw.write(lines[i]);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
