package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract{
	//ATRIBUTOS
	/*
	 * [dateIn] --> DATA NO FORMATO DE STRING
	 * [date] --> DATA QUE IRÁ RECEBER O VALOR DE dateIn E CONVERTER PARA LocalDate
	 * [valuePerHour] --> VALOR DA HORA TRABALHADA
	 * [hours] --> QUANTIDADE DE HORAS TRABALHADA
	 */
	private String dateIn;
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	
	//CONSTRUTOR
	/*
	 * [DateTimeFormatter fmt] --> CONFIGURADO PARA DATA NO FORMATO (DIA/MÊS/ANO)
	 * [this.date] --> RECEBE A DATA FORMATADA
	 */
	public HourContract(String dateIn , Double valuePerHour, Integer hours) {
		this.dateIn = dateIn;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.date = LocalDate.parse(dateIn, fmt);
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	
	//GET'S E SET'S
	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public LocalDate getDate() {
		return date;
	}

	
	//MÉTODOS DE NEGÓCIO
	/*
	 * [totalValue()] --> RETORNA O VALOR TOTAL TRABALHADO
	 */
	public Double totalValue() {
		return this.valuePerHour * this.hours;
	}
	
	
	//TO STRING
	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
	
}
