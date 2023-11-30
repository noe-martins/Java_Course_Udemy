package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramModel_2 {

	public static void main(String[] args) {
		String path = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao17\\assets\\Texto.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			/*
			 * BufferedReader USA O FileReader PARA LER OS DADOS DE 2 A 4 bytes POR VEZ
			 * E GUARDA A LINHA INTEIRA EM UMA ESPAÇO NA MEMÓRIA RAM.
			 * ISSO FAZ COM QUE SEJA MAIS RÁPIDO A USA LEITURA E QUE POSSA LER QUALQUER TIPO DE ARQUIVO BRUTO
			 */
			br = new BufferedReader(fr);
			
			//A VARIÁVEL line VAI ARMAZENAR A PRIMEIRA LINHA DO BUFFER
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				//SE NÃO COLOCAR ESSA LINHA O PROGRAMA VAI FICAR NO LOOP INFINITO MOSTRANDO SÓ A PRIMEIRA LINHA DO BUFFER
				//AQUI O BUFFER VAI PARA OUTRA LINHA E ASSIM POR DIANTE ATÉ A PRÓXIMA LINHA FOR NULL
				line = br.readLine();
			}
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			try {
				if (br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
