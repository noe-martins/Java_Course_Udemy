package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramGetPut {

	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("João");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(35);
		
		System.out.println(myNums);
		
		/*
		 * NÃO PODE ATRIBUIR PARA A VARIÁVEL x DO TIPO Number PORQUE A List myNums PODE SER DE OUTROS TIPOS ACIMA DE Number.
		 * QUE NO CASO É, POIS É DO TIPO String O PRIMEIRO ELEMENTO.
		 */
		//Number x = myNums.get(0);
	}

}
