package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoData {

	public static void main(String[] args) {
		//****DATAS E HORAS****
		//LOCAIS
		LocalDate d01 = LocalDate.parse("2023-05-01");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-01T10:46:21");
		// GLOBAL
		Instant d03 = Instant.parse("2023-05-01T10:46:21-03:00");
		
		//****OPERAÇÕES****
		//.minus --> LEVA PARA TRÁS
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		System.out.println("\tLocalDate\nData original: " + d01 + "\nData Modificada: " + pastWeekLocalDate);
		LocalDateTime pastWeekLocalDateTime = d02.minusHours(2);
		System.out.println("\tLocalDateTime\nData original: " + d02 + "\nData Modificada: " + pastWeekLocalDateTime);
		
		//.plus --> LEVA PARA FRENTE
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		System.out.println("\n\n\tLocalDate\nData original: " + d01 + "\nData Modificada: " + nextWeekLocalDate);
		LocalDateTime nextWeekLocalDateTime = d02.plusMinutes(25);
		System.out.println("\tLocalDateTime\nData original: " + d02 + "\nData Modificada: " + nextWeekLocalDateTime);
		
		//COM DATA-HORÁRIO GLOBAL
		//.minus(VALOR, TIPO)
		//ChronoUnit --> PEGA QUAL TIPO É PARA FAZER A CONTAGEM (DIAS, HORAS...)
		Instant pastInstant = d03.minus(7, ChronoUnit.DAYS);
		System.out.println("\n\n\tInstant\nData original: " + d03 + "\nData Modificada: " + pastInstant);
		Instant nextInstant = d03.plus(3, ChronoUnit.HOURS);
		System.out.println("\n\n\tInstant\nData original: " + d03 + "\nData Modificada: " + nextInstant);
		
		//DURAÇÃO DE DATAS
		//COM LocalDateTime
		//.between(DATA INICIAL, DATA FINAL)
		//.toMinutes() --> MÉTODO ESTÁTICO QUE DIZ QUE TIPO DE VALOR VOCÊ QUER RECEBER A DURAÇÃO
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		System.out.println("\n\n\tDURATION\nData original: " + d02 + "\nDuração = " + t1.toMinutes());
		
		//COM LocalDate
		//.atStrartOfDay() --> USA-SE ESSE MPÉTODO PORQUE PARA USAR O DURATION PRECISA CONVERTER PARA LocalDateTime
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		System.out.println("\n\n\tDURATION\nData original: " + d01 + "\nDuração = " + t2.toDays());

	}

}
