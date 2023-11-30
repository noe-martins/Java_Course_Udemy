package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {
		
	}
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
		/*
		 * AQUI DÁ PARA LANÇAR A EXCEPTION NO CONSTRUTOR DA CLASSE
		 * BOA PRÁTICA: COLOCAR AS EXCEPTIONS NO COMEÇO DO MÉTODO
		 */
		if(checkOut.isBefore(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public LocalDate getCheckIn() {
		return checkIn;
	}
	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public Long duration() {
		Duration daysDuration = Duration.between(this.checkIn.atStartOfDay(), this.checkOut.atStartOfDay());
		return daysDuration.toDays();
	}
	public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		LocalDate now = LocalDate.now();
		/*
		 * throw new --> LANÇA A EXCEÇÃO, PORÉM PRECISA SER TRATADA COM TRY...CATCH
		 * throws DomainException --> NA ASSINATURA DO MÉTODO DIZ: "ESSE MÉTODO PODE LANÇAR UMA EXCEÇÃO QUE NÃO VAI SER TRATADA AQUI"
		 */
		if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(checkOut.isBefore(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		sb.append("Reservation: Romm " + this.roomNumber + ", ");
		sb.append("check-in: " + this.checkIn.format(fmt) + ", ");
		sb.append("check-out: " + this.checkOut.format(fmt) + ", ");
		sb.append(duration() + " nights");
		return sb.toString();
	}
}
