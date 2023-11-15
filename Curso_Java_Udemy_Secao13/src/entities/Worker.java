package entities;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.enums.WorkerLevel;

public class Worker{
	//ATRIBUTOS
	/*
	 * [String name] --> NOME DO TRABALHADOR
	 * [WorkerLevel level] --> ENUM CONTENDO O NÍVEL DE MATURIDADE PROFISSIONAL
	 * [Double baseSalary] --> VALOR DO SALÁRIO BASE DO TRABALHADOR
	 * [Department nameDepartment] --> OBJETO DA CLASSE Department CONTENDO O NOME DO DEPARTAMENTO DO TRABALHADOR
	 * [List<HourContract> contractList] --> LISTA DE OBJETOS DA CLASSE HourContract QUE FICAM ARMAZENADO OS CONTRATOS DO TRABALHADOR
	 */
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department nameDepartment;
	private List<HourContract> contractList = new ArrayList<>();
	
	
	//CONSTRUTOR
	public Worker(String name, WorkerLevel level, Double baseSalary, Department nameDepartment) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.nameDepartment = nameDepartment;
	}
	
	
	//GET'S E SET'S
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public List<HourContract> getContractList() {
		return contractList;
	}
	public Department getNameDepartment() {
		return nameDepartment;
	}


	//MÉTODOS DE NEGÓCIO
	/*
	 * [addContract(HourContract contracts)] --> ADICIONA NA LISTA OS CONTRATOS DO TRABALHADOR
	 * [income(Integer month, Integer year)] --> BUSCA NA LISTA OS CONTRATOS ESPECIFICADOS PELO MÊS E ANO E RETORNA A SOMA TOTAL DO VALOR TRABALHADO
	 * ######### [dateAlvo] --> FAZ O FILTRO NA LISTA DE CONTRATOS COM BASE NOS PARÂMETROS (month e year) E CRIA UMA NOVA LISTA SÓ COM OS OBJETOS
	 * ######### FILTRADOS.
	 * ######### [sum += dateAlvo.get(i).totalValue()] --> PERCORRE A LISTA FILTRADA E SOMA OS VALORES TOTAIS TRABALHADOS
	 */
	public void addContract(HourContract contracts) {
		this.contractList.add(contracts);
	}
	
	public Double income(Integer month, Integer year) {
		Double sum = 0.0;
		List<HourContract> dateAlvo = 
				this.contractList.stream()
				.filter(objeto -> objeto.getDate().getMonthValue() == month && objeto.getDate().getYear() == year)
				.collect(Collectors.toList());
		for (int i = 0; i < dateAlvo.size(); i++) {
			sum += dateAlvo.get(i).totalValue();
		}
		return sum;
	}
	
	
	//TO STRING
	@Override
	public String toString() {
		return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", nameDepartment="
				+ nameDepartment.getName() + "]";
	}
	
	
}
