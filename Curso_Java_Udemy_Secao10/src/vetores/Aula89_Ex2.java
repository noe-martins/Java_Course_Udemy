package vetores;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Aula89_Ex2 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		int N = Integer.parseInt(textInput("Quantas produtos para cadastrar: "));
		Double cont = 0.0;
		
		//Cria-se um vetor "produtos" do tipo Produto (Classe), que possui "N" elementos.
		Produto[] produtos = new Produto[N];
		
		for (int i = 0; i < produtos.length; i++) {
			//Aqui o vetor de "N" posições está com valores "Null" em seus elementos na memória Heap
			System.out.println(produtos[i]);
		}
		
		for (int i = 0; i < produtos.length; i++) {
			String name = textInput("Nome do Produto " + i + ": ");
			Double price = Double.parseDouble(textInput("Preço do produto " + i + ": "));
			//Aqui faz a instanciação dos elementos do vetor "produtos" baseado no construtor da Classe que faz seu tipo
			produtos[i] = new Produto(name, price);
			cont += price;
		}
		
		for (int i = 0; i < produtos.length; i++) {
			//Aqui já podemos ver que o elemento não está mais "null" porém contém um endereço de memória de um objeto
			System.out.println(produtos[i]);
		}
		
		for (int i = 0; i < produtos.length; i++) {
			//A partir daqui cada elemento do vetor pode ser acessado
			System.out.println(produtos[i].getNome());
			System.out.println(produtos[i].getPreco());
		}
		System.out.println("Média: " + (cont/N));
		
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
