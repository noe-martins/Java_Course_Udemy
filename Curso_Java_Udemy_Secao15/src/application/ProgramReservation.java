package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class ProgramReservation {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Integer roomNumber = Integer.parseInt(textInput("Room number: "));
		LocalDate checkIn = LocalDate.parse(textInput("Check-in date (dd/MM/yyyy): "), fmt);
		LocalDate checkOut = LocalDate.parse(textInput("Check-out date (dd/MM/yyyy): "), fmt);
		if (checkOut.isBefore(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservetion = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservetion);
			
			System.out.println();
			System.out.println("\nEnter data to update the resrvation:");
			checkIn = LocalDate.parse(textInput("Check-in date (dd/MM/yyyy): "), fmt);
			checkOut = LocalDate.parse(textInput("Check-out date (dd/MM/yyyy): "), fmt);
			
			String update = reservetion.updateDates(checkIn, checkOut); 
			if (update != null) {
				System.out.println("Error in reservation: " + update);
			} else {
				System.out.println(reservetion);
			}
			
		}
	
		leitor.close();
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
