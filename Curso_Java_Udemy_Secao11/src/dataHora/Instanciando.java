package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDate e LocalDateTime --> LOCAIS
 * Instant --> GLOBAL
 */
public class Instanciando {

	public static void main(String[] args) {
		//DateTimeFormatter fmt = 
		
		// ------------------------ INSTANCIANDO DATA E HORA LOCAL ------------------------
		/*
		 * LocalDate --> CLASSE PARA DATA
		 * .now() --> MÉTODO ESTÁTICO DA CLASSE QUE PEGA A DATA LOCAL "AGORA" DO USUÁRIO
		 * .toString() --> A CLASSE JÁ DEVOLVE NO FORMATO ISO 8601
		 * 
		 */
		LocalDate d01 = LocalDate.now();
		System.out.println("Instanciando Data Agora Local\n");
		System.out.println("d01 = " + d01.toString());
		System.out.println("TIPO: " + d01.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Instanciando Data-Hora Agora Local\n");
		System.out.println("d02 = " + d02);
		System.out.println("TIPO: " + d02.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		// ------------------------ INSTANCIANDO ISO 8601 (GLOBAL) DE AGORA  ------------------------
		/*
		 * Instant --> CLASSE QUE TRAZ DE TRAZ RESULTADOS DE ACORDO COM A ISO 8601
		 * ANO-MES-DIATHH:MM:SS:FRACAOSEGUNDOS(LETRA DO FUSO HORARIO)
		 * 
		 */
		Instant d03 = Instant.now();
		System.out.println("Instanciando Texto ISO 8601 (Global) de agora\n");
		System.out.println("d03 = " + d03);
		System.out.println("TIPO: " + d03.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		// ------------------------ INSTANCIANDO LOCALDATE E HORA P/ FORMATO ISO 8601  ------------------------
		/*
		 * .parse() --> PASSAR O FORMATO QUE TERÁ O LOCALDATE OU LOCALDATETIME
		 * 
		 */
		LocalDate d04 = LocalDate.parse("2023-11-23");
		System.out.println("Instanciando Texto ISO 8601 (Global) de agora\n");
		System.out.println("d04 = " + d04);
		System.out.println("TIPO: " + d04.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		LocalDateTime d05 = LocalDateTime.parse("2023-11-23T01:05:26");
		System.out.println("d05 = " + d05);
		System.out.println("TIPO: " + d05.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		// ------------------------ INSTANCIANDO UMA DATA E HORÁRIO PARA O FORMATO ISO UTC (LONDRES)  ------------------------
		/*
		 * O "-03:00" EQUIVALE A: GMT-3
		 * ELE CONVERTEU O HORÁRIO PASSADO NO .parse().
		 * ISSO SÓ PODE SER FEITO COM O Instant
		 */
		Instant d06 = Instant.parse("1994-11-23T10:03:23-03:00");
		System.out.println("Instanciando uma Data-hora no formato ISO para o horário UTC (Londres)\n");
		System.out.println("d06 = " + d06);
		System.out.println("TIPO: " + d06.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		// ------------------------ INSTANCIANDO UMA DATA E HORÁRIO LOCAL PERSONALIZADA  ------------------------
		/*
		 * DateTimeFormatter --> BIBLIOTECA QUE CONVERTE STRING PARA FORMATO DE DATA
		 * .ofPattern() --> MÉTODO ESTÁTICO DA CLASSE QUE RECEEBE OS PARÂMETROS DE CONVERSÃO POR SIMBOLOS QUE ESTÃO PROGRAMADOS NA BIBLIOTECA
		 * LocalDate.parse() --> PODE RECEBER DOIS PARÂMETROS (A DATA PERSONALIZADA, A CONVERSÃO)
		 * OBS:
		 * 	1) LEMBRANDO QUE A CLASSE LOCALDATE DEVOLVE COMO toString O FORMATO ISO 8601, POR ISSO NA IMPRESSÃO APARECE AO CONTRÁRIO
		 */
		LocalDate d07 = LocalDate.parse("23/11/1994", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Instanciando uma Data personalizada (Dia/Mês/Ano)\n");
		System.out.println("d07 = " + d07);
		System.out.println("TIPO: " + d07.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		LocalDateTime d08 = LocalDateTime.parse("01/05/2023 10:46", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("d08 = " + d08);
		System.out.println("TIPO: " + d08.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		// ------------------------ INSTANCIANDO UMA DATA NO FORMATO (ano, mes, dia)  ------------------------
		/*
		 * 
		 */
		LocalDate d09 = LocalDate.of(1994, 11, 23);
		System.out.println("Instanciando uma Data no formato (ano, mes, dia)\n");
		System.out.println("d09 = " + d09);
		System.out.println("TIPO: " + d09.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		LocalDateTime d10 = LocalDateTime.of(1994, 11, 23, 10, 46, 50);
		System.out.println("d10 = " + d10);
		System.out.println("TIPO: " + d10.getClass());
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
	}

}
