package application;

import java.io.File;

public class ProgramModel_6 {

	public static void main(String[] args) {
		File path = new File("C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao17\\assets\\subdir\\Teste");
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());

	}

}
