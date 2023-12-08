package model.service;

import java.util.ArrayList;
import java.util.List;

/*
 * - AGORA A CLASSE ESTÁ PARAMETRIZADA PARA TIPO <T>, OU SEJA, PODE ASSUMIR QUALQUER TIPO NO PROGRAMA
 * - TODOS OS MÉTODOS DEVEM RECEBER A MUDANÇA, JUNTAMENTE COM A SUAS OPERAÇÕES
 */
public class PrintService<T> {
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	public T first() {
		return list.get(0);
	}
	public void print() {
		System.out.print("[" + list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
