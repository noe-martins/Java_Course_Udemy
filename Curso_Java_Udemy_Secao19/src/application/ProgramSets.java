package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSets {
	/*
	 * RESULTADO:
		[0, 2, 4, 5, 6, 8, 10]
		União AB: [0, 2, 4, 5, 6, 7, 8, 9, 10]
		[0, 2, 4, 5, 6, 8, 10]
		Intercessão AB: [5, 6, 7, 8, 9, 10]
		[0, 2, 4, 5, 6, 8, 10]
		Diferença AB: [0, 2, 4]
	 */

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//Union
		Set<Integer> c = new TreeSet<Integer>(a);//PEGA OS VALORES DA "Set<> a"
		System.out.println(c);
		c.addAll(b); //ADICIONA TODOS OS ELEMENTOS DE "b" QUE NÃO ESTÃO EM "a"
		System.out.println("União AB: " + c);
		
		//Intersection
		Set<Integer> d = new TreeSet<Integer>(a);
		System.out.println(d);
		d.retainAll(b); //COLOCA SÓ OS ELEMENTOS EM COMUM EM "a" e "b"
		System.out.println("Intersecção AB: " + b);
		
		//Difference
		Set<Integer> e = new TreeSet<Integer>(a);
		System.out.println(e);
		e.removeAll(b); //REMOVE OS ELEMENTOS DE "b" QUE ESTÃO EM "a"
		System.out.println("Diferença AB: " + e);
	}

}
