package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Convertendo {

	/**
	 * CONVERTE DATAS EM FORMATO TEXTO PARA AS PERSONALIZADAS PARA O PROGRAMA
	 */
	public static void main(String[] args) {
		
		//Datas em textos ISO 8601
		//LOCAIS
		LocalDate d01 = LocalDate.parse("2023-05-01");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-01T10:46:21");
		//GLOBAL
		Instant d03 = Instant.parse("2023-05-01T10:46:21-03:00");
		
		//FORMATAÇÕES
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("Z"));
		
		//IMPRESSÕES
		System.out.println("d01 = " + fmt1.format(d01));
		System.out.println("d02 = " + fmt2.format(d02));
		System.out.println("d03 = " + fmt3.format(d03));
	}

}
