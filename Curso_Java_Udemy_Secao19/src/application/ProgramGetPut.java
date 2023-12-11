package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramGetPut {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		System.out.println(myObjs);
		
		copy(myDoubles, myObjs);
		System.out.println(myObjs);
		
	}
	/*
	 * List<? extends Number> source --> É UM CASO DE COVARIÂNCIA (POSSO ACESSAR OS VALORES [FEITO ISSO NO FOR])
	 * List<? super Number> destiny --> É UM CASO DE CONTRAVARIÂNCIA (POSSO ADICIONAR VALORES
	 */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number numbers : source) {
			destiny.add(numbers);
		}
	}
	
}
