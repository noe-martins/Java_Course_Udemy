package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//TESTE DE FUNCIONAMENTO DOS OBJETOS
		Department dp = new Department(1, "Técnico");
		
		Seller sl = new Seller(1, "Noé", "noe@gmail.com", LocalDate.now(), 3000.00, dp);
		
		System.out.println(sl);

	}

}
