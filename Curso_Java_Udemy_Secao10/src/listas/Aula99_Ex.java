package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

/**
 * APRENDIZADOS:
 * 1) PARA IMPRIMIR OS DADOS DE UMA LISTA QUE TEM DENTRO DELA OBJETOS O MELHOR A SE USAR É O "for each" E O "toString" NA CLASSE
 * 2) O PREDICADO PEGA O OBJETO INTEIRO EM QUE ESTÁ AQUELE PARÂMETRO
 */
public class Aula99_Ex {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		// CADASTRO DE FUNCIONÁRIOS
		int qtdRegistro = Integer.parseInt(textInput("How many emplyoees will be registered: "));
		
		for (int i = 0; i < qtdRegistro; i++) {
			System.out.println("\nEmployee #" + (i+1));
			int id = Integer.parseInt(textInput("Id: "));
			while (hasId(funcionarios, id)) {
				System.out.println("Esse ID já existe. Tente novamente");
				id = Integer.parseInt(textInput("Id: "));
			}
			String nome = textInput("Name: ");
			Double salario = Double.parseDouble(textInput("Salary: "));
			funcionarios.add(new Funcionario(id, nome, salario));
		}
		
		//IMPRESSÃO DOS DADOS DOS FUNCIONÁRIOS
		System.out.println("\nList of employees: ");
		for (Funcionario func : funcionarios) {
			System.out.println(func);
		}
		
		//AUMENTO DO SALARIO DADO UMA PORCENTAGEM
		int id = Integer.parseInt(textInput("\nEnter the employee id that will have salary increase: "));
		Funcionario fun = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (fun == null) {
			System.out.println("Não tem esse ID");
		} else {
			double porcentagem = Double.parseDouble(textInput("Enter the percentage: "));
			fun.incrementoSalario(porcentagem);
		}
		
		//IMPRESSÃO DOS DADOS DOS FUNCIONÁRIOS
		System.out.println("\nList of employees: ");
		for (Funcionario func : funcionarios) {
			System.out.println(func);
		}
		
		
	}
	
	private static boolean hasId(List<Funcionario> list, int id) {
		Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fun != null;
	}

	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
