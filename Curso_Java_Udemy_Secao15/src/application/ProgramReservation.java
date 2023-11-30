package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class ProgramReservation {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			Integer roomNumber = Integer.parseInt(textInput("Room number: "));
			LocalDate checkIn = LocalDate.parse(textInput("Check-in date (dd/MM/yyyy): "), fmt);
			LocalDate checkOut = LocalDate.parse(textInput("Check-out date (dd/MM/yyyy): "), fmt);
			Reservation reservetion = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservetion);
	
			System.out.println("\nEnter data to update the resrvation:");
			checkIn = LocalDate.parse(textInput("Check-in date (dd/MM/yyyy): "), fmt);
			checkOut = LocalDate.parse(textInput("Check-out date (dd/MM/yyyy): "), fmt);
			reservetion.updateDates(checkIn, checkOut);
			System.out.println(reservetion);
		}catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
	
		leitor.close();
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
