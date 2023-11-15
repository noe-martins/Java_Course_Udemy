package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Commente;
import entities.Post;

public class ProgramEx2 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date1 = LocalDateTime.parse("21/06/2018 13:05:44", fmt);
		String title1 = "Traveling New Zealand";
		String content1 = "I'm going to visit this wonderful country!";
		Integer likes1 = 12;
		Post p1 = new Post(date1, title1, content1, likes1);
		p1.addComent(new Commente("Have a nice trip"));
		p1.addComent(new Commente("Wow that's awesome!"));
		
		System.out.println(p1);
	}

}
