package vetores;

import java.util.Locale;
import java.util.Random;

public class ExercicioFixacao_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int N = 4;
		Random numbers = new Random();
		Double[] vector = new Double[N];
		Double soma = 0.0;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = numbers.nextDouble(10.00);
			soma += vector[i];
		}
		
		System.out.print("VALORES = ");
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.2f ", vector[i]);
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MÉDIA = %.2f", (soma/N));

	}

}
