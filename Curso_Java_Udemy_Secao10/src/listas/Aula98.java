package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula98 {

	public static void main(String[] args) {
		/*
		 * 1) List é uma interface, logo precisa de uma classe para implementá-la. Por isso o ArrayList
		 * 2) List só usa como parâmetro Wrapper classes.
		 * 3) ArrayList é uma classe que turbina o uso de vetores
		 */
		List<String> list = new ArrayList<>();
		
		/*
		 * -------------------------------------------------------
		 * ADICIONANDO ELEMENTO NA LISTA
		 * -------------------------------------------------------
		 */
		System.out.println("Adicionando Elementos: \n");
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		//list.size() = É PARA SE TER O TAMANHO DA LISTA
		//list.get(position) = É PARA OBTER O ELEMENTO DE UMA POSIÇÃO DA LISTA
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		
		
		
		/*
		 *  -------------------------------------------------------
		 * ADICIONANDO ELEMENTO NA LISTA EM UMA POSIÇÃO ESPECÍFICA
		 *  -------------------------------------------------------
		 */
		System.out.println("Adicionando Elementos em uma posição específica: \n");
		list.add(1, "Noé");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		/*
		 * OBS:
		 * 1) COLOCOU A STRING NA POSIÇÃO 1 E COLOCOU OS OUTROS PARA BAIXO
		 * 	
		 */
		
		
		/*
		 * -------------------------------------------------------
		 * REMOVENDO ELEMENTOS DA LISTA
		 * -------------------------------------------------------
		 */
		//REMOVENDO UM OBJETO - list.remove(obj);
		System.out.println("Removendo um objeto da lista: \n");
		list.remove("Maria");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}
		System.out.println("--------------------------------------------------------");
		/*
		 * OBS:
		 * 1) REMOVEU O OBJETO STRING E SUBIU OS OUTROS ELEMENTOS DA LISTA
		 * 2) REMOVEU TAMBÉM A POSIÇÃO DA STRING (DIMINUIU A LISTA)
		 */
		
		//REMOVENDO UMA POSIÇÃO DA LISTA - list.remove(int);
		System.out.println("Removendo uma posição da lista: \n");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}
		System.out.println("--------------------------------------------------------");
		/*
		 * OBS:
		 * 1) REMOVEU NÃO SÓ O OBJETO STRING COMO TAMBÉM A POSIÇÃO DA LISTA.
		 * 2) REDUZIU O TAMANHO DA LISTA
		 */
		
		//REMOVENDO COM UMA CONDIÇÃO
		
		//AQUI É UMA FUNÇÃO LAMBDA
		//LÊ-SE: REMOVA TODA STRING "x", TAL QUE "->" O PRIMEIRO CARACTERE DA STRING "x.charAt(0)" SEJA "==" A 'N'
		System.out.println("Removendo um objeto da lista com uma condição: \n");
		list.removeIf(x -> x.charAt(0) == 'N');
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		/*
		 * OBS:
		 * 1) REMOVEU A STRING JUNTO COM A POSIÇÃO, OU SEJA: DIMINUIU O TAMANHO DA LISTA
		 */
		
		/*
		 * *******************************************************
		 * -------------------------------------------------------
		 * 		   EXTRA - ADICIONANDO MAIS NOMES NA LISTA
		 * -------------------------------------------------------
		 * *******************************************************
		 */
		list.add("João");
		list.add("Alexia");
		list.add("Docinho");
		list.add("Ana Clara");
		System.out.println("\t\tFOI ADICIONADO MAIS NOMES!");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		/*
		 * 
		 */
		
		/*
		 * -------------------------------------------------------
		 * ECONTRANDO POSIÇÕES DOS ELEMENTOS DA LISTA
		 * -------------------------------------------------------
		 */
		// ENCONTRANDO O INDEX DO ELEMENTO PELO SEU NOME
		System.out.println("Encontrando posições dos elementos da lista: \n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}
		//Procura pelo começo
		System.out.println("\nPosição do Bob: " + list.indexOf("Bob"));
		//Procura pelo final
		System.out.println("Posição da Alexia: " + list.lastIndexOf("Alexia"));
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		
		
		/*
		 * -------------------------------------------------------
		 * FILTRANDO LISTA COM BASE NO PREDICADO
		 * -------------------------------------------------------
		 */
		System.out.println("Filtrando lista com base no predicado dado: \n");
		//---LÊ-SE: CONVERTE A LISTA "list" PARA UM TIPO "Stream".(Stream É UM TIPO ESPECIAL DO JAVA QUE ACEITA OPERAÇÕES LAMBDA)
		//filter É UMA FUNÇÃO QUE RECEBE UM PREDICADO.
		//"PREDICADO" É UAM FUNÇÃO QUE RECEBE UM ARGUMENTO E RETORNA UM VALOR BOOLEANO
		//"collect" É UM MÉTODO PARA RECOLHER OS ELEMENTOS QUE PASSARAM NO FILTRO
		//PEGA ESSES ELEMENTOS E COLOCA NA NOVA LISTA "result"
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}
		System.out.println();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(i + " - " + result.get(i));
		}
		System.out.println("--------------------------------------------------------");
		
		
		//FILTRANDO APENAS O PRIMEIRO ELEMENTO DE UM PREDICADO
		System.out.println("Filtrando apena o primeiro elemento do fluxo dado pelo predicado: \n");
		
		//findFirst() É UM MÉTODO QUE PEGA O PRIMEIRO ELEMENTO DO PREDICADO OU RETORNA "null" CASO NÃO TENHA NO FLUXO DE ELEMENTO
		//orElse() É UM MÉTODO QUE APENAS RETORNA O VALOR QUE ESTIVER DENTRO DO SEU ARGUMENTO
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse("Não tem esse nome na lista");
		System.out.println(name);
		
	}

}
