package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramStream {

	public static void main(String[] args) {
		
		/*
		 * FORMAS DE SE CRIAR UMA Stream E ALGUMAS OPERAÇÕES
		 */
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		Stream<Integer> st1 = list.stream();
		//toArray() --> OPERAÇÃO TERMINAL (OS "to" CONVERTE A Stream PARA UM FORMATO ESPECÍFICO
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "João", "Cebolinha");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		//.limit() --> OPERAÇÃO INTERMEDIÁRIA QUE LIMITA ATÉ ONDE PERCORRER NA Stream
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		/*
		 * DEMONSTRAÇÃO DE PIPELINE (OPERAÇÕES DE STREAM EM CADEIA)
		 */
		//.map() --> OPERAÇÃO INTERMEDIÁRIA QUE APLICA UMA FUNÇÃO EM CADA ELEMENTO DA STREAM
		Stream<Integer> st4 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st4.toArray()));
		
		//.reduce() --> OPERAÇÃO TERMINAL QUE EXECUTA UMA FUNÇÃO BINÁRIA NO SEGUNDO PARÂMETRO E VAI ITERANDO A PARTIR DO PONTO INICIAL DADO NO
		//PRIMEIRO PARÂMETRO
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		/*
		 * OPERAÇÕES:
		 * - .filter() --> OPERAÇÃO INTERMEDIÁRIA QUE FILTRA ELEMENTOS DA LISTA
		 * - .collect() --> OPERAÇÃO TERMINAL QUE RECEBE NO PARÂMETRO UM Collectors E PODE RETORNAR UMA LIST
		 * 
		 * OBSRVAÇÕES:
		 * - A List TAMBÉM TEM O MÉTODO .toArray()
		 */
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
		
		/*
		 * OBS:
		 *  - OPERAÇÕES INTERMEDIÁRIAS: MÉTODOS QUE PODEM TER OUTROS AGREGADOS
		 *  - OPERAÇÕES TERMINAIS: SÓ UM MÉTODO PRA CHAMAR E ENCERRA A STREAM
		 *  - VANTAGEM DA STREAM É QUE PODE SER FEITO OPERAÇÕES AGREGADAS EM COLEÇÕES DE DADOS
		 */
		
	}

}
