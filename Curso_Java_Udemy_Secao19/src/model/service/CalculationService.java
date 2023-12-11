package model.service;

import java.util.List;
public class CalculationService {
	/*
	 * <T extends Comparable<T>>, LÊ-SE: 
	 *  - O MÉTODO VAI TRABALHAR COM O TIPO GENÉRICO "T" E ESSE TIPO HERDA OS MÉTODOS DA INTERFACE  "Comparable<T>".
	 * T max(List<T> list), LÊ-SE: 
	 *  - O MÉTODO RETORNARÁ UM TIPO "T" E COMO PARÂMETRO TERÁ UMA "List" DO TIPO T
	 */
	public static <T extends Comparable<T>> T max(List<T> list) {
		//SERÁ ATRIBUÍDO A VARIÁVEL "max" O PRIMEIRO ITEM DA "list" DADA NO PARÂMETRO
		T max = list.get(0);
		for (T item : list) {
			/*
			 * COMO O TIPO "T" extends DA INTERFACE "Comparable", USA-SE O "compareTo" COM OS OBJETOS "T" APONTADOS PELA VARIÁVEL "item".
			 * "max" É O INCREMENTADOR.
			 * (item.compareTo(max) > 0), LÊ-SE: PEGA O "this" DE "item" E COMPARA COM O "max"
			 * [INTERESSANTE: PODE VIR NO PARÂMETRO DO .compareTo(), UMA VARIÁVEL "T" E NÃO SÓ NECESSARIAMENTE UMA "List"]
			 */
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
