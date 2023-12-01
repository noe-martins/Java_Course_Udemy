package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.SalesData;

public class ExercicioFx {
	
	private static String path = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao17\\assets\\Vendas\\sales.csv";
	private static String pathSub = "C:\\Users\\noex_\\git\\Java_Course_Udemy__POO\\Curso_Java_Udemy_Secao17\\assets\\Vendas\\out";
	private static List<SalesData> salesData = new ArrayList<>();
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		fileReading();
		fileWriterCreate();
	}
	private static void fileWriterCreate() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathSub + "\\summary.csv"))){
			for (SalesData salesDatas : salesData) {
				StringBuilder sb = new StringBuilder();
				sb.append(salesDatas.getName() + ",");
				sb.append(String.format("%.2f", salesDatas.total()));
				bw.write(sb.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void fileReading() {
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] datas = line.split(",");
				String name = datas[0];
				Double price = Double.parseDouble(datas[1]);
				Integer quantity = Integer.parseInt(datas[2]);
				salesData.add(new SalesData(name, price, quantity));
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
