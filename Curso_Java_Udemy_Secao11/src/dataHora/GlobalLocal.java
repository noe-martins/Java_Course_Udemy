package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalLocal {

	/**
	 * CONVERTE DATA GLOBAL PARA LOCAL
	 */
	public static void main(String[] args) {
		//GLOBAL
		Instant d01 = Instant.parse("2023-05-01T10:46:21-03:00");
		Instant d02 = Instant.parse("1994-11-23T10:00:15Z");
		
		//CONVERSÃO
		LocalDate r01 = LocalDate.ofInstant(d01, ZoneId.of("Z"));
		LocalDateTime r02 = LocalDateTime.ofInstant(d02, ZoneId.systemDefault());
		LocalDateTime r03 = LocalDateTime.ofInstant(d02, ZoneId.of("Portugal"));
		
		//IMPRESSÃO
		System.out.println("r01 = " + r01);
		System.out.println("r02 = " + r02);
		System.out.println("r03 = " + r03);
	}

}
