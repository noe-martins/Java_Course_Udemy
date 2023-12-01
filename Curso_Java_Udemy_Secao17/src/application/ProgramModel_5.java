package application;

import java.io.File;
import java.util.Scanner;

public class ProgramModel_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (int i = 0; i < folders.length; i++) {
			System.out.println(folders[i]);
		}
		
		File[] files = path.listFiles(File::isFile);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		
		sc.close();

	}

}
