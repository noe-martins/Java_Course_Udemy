package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class GradeProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.setName(sc.nextLine());
		student.setFirstTrimester(sc.nextDouble());
		student.setSecondTrimester(sc.nextDouble());
		student.setThirdQuarter(sc.nextDouble());
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.FinalGrade()));
		System.out.println(student.StudentStatus());
	}

}
