package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramGetPut {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		System.out.println(x);
		
		/*
		 * ERRO put -> ISSO OCORRE PORQUE A CLASSE Numbers PODE SER DE DIFERENTE TIPOS, ISSO OCORRE PORQUE O COMPILADOR
		 * NÃO SABE SE SERÁ ADICIONADO UM NÚMERO COMPATÍVEL COM OUTRO DO TIPO Number
		 */
		//list.add(20);
	}

}
