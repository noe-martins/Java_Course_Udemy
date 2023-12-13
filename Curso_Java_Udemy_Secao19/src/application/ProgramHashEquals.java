package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Client;

public class ProgramHashEquals {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		/*
		 * O HASHCODE COMPARA CONTEÚDO, OU SEJA, MESMO QUE O BJETO ESTEJA SENDO REFERENCIADO POR VARIÁVEIS DIFERENTE (ESPAÇOS DIFERENTES NA
		 * MEMÓRIA HEAP), TERÃO O MESMO HASHCODE
		 */
		Client c1 = new Client("Noé", "noe@gmail.com");
		Client c2 = new Client("Ana", "ana@gmail.com");
		Client c3 = new Client("Noé", "noe@gmail.com");
		
		List<Client> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		for (Client client : clientes) {
			System.out.println(client.hashCode());
		}
		clientes.remove(c3);
		
		
		
		/*
		 * EXEMPLO DE COMPARAÇÃO COM "equals" E COM "hashCode" DE UM DADO FORNECIDO PELO USUÁRIO 
		 */
		System.out.println("Dados do cliente a pesquisar:");
		Client clientePesquisa = new Client(textInput("Nome: "), textInput("Email: "));
		
		//VALIDAÇÃO COM O hashCode()
		for (Client client : clientes) {
			if (client.hashCode() == clientePesquisa.hashCode()) {
				System.out.println("Cliente já cadastrado (USANDO O hashCode)");
			}
		}
		
		//VALIDAÇÃO COM O equals()
		for (Client client : clientes) {
			if (client.equals(clientePesquisa)) {
				System.out.println("Cliente já cadastrado (USANDO O equals)");
			}
		}
		
		
		
		/*
		 * COMPARAÇÃO DE OBJETOS E LITERAIS
		 */
		String s1 = "Teste";
		String s2 = "Teste";
		System.out.println(s1 == s2); //RESULTADO: true
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		System.out.println(s3 == s4); //RESULTADO: false
		
		leitor.close();
		
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
