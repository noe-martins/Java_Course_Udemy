package vetores;

import java.util.Random;

public class ExercicioFixacao_01 {

	public static void main(String[] args) {
		int N = 10;
		Random numbers = new Random();
		int[] vector = new int[N];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = numbers.nextInt(21) - 10;
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] < 0) {
				System.out.println(vector[i]);
			}
		}
	}

}
