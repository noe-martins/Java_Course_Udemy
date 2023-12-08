package model.service;

import java.util.ArrayList;
import java.util.List;

/*
 * PROBLEMAS: 
 * 1) NÃO DÁ PARA FAZER REUSO DA CLASSE CASO QUEIRA FAZER UMA LISTA DE "Strings". TEM QUE FAZER UM NOVA CLASSE.
 * 2) SE TENTAR USAR A CLASSE "Object" NO "List" PODE DAR PROBLEMA DE "Type safety", OU SEJA, INSEGURANÇA DE TIPO CASO NO PROGRAMA
 * PRINCIPAL SEJA COLOCADO UM OUTRO TIPO DE VARIÁVEL PARA SER ARMAZENADO.
 * 3) USANDO O "Object" TAMBÉM CAI A PERFORMANCE, POIS TERÁ QUE USAR CASTINGS PARA TRANSFORMAR UM "Object" PARA OUTRO TIPO.
 */
public class PrintService {
	List<Integer> numbers = new ArrayList<>();
	
	public void addValue(int value) {
		numbers.add(value);
	}
	public Integer first() {
		return numbers.get(0);
	}
	public void print() {
		System.out.print("[" + numbers.get(0));
		for (int i = 1; i < numbers.size(); i++) {
			System.out.print(", " + numbers.get(i));
		}
		System.out.println("]");
	}
}
