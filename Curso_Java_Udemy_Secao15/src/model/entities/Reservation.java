package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {
		
	}
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
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
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
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
