package entities;

public class Funcionario extends Pessoa{
	
	int id;
	Double salario;

	public Funcionario(int id, String nome, Double salario) {
		super(nome);
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void incrementoSalario(Double porcentagem) {
		Double operacao = (porcentagem / 100) + 1;
		setSalario(operacao * this.salario);
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", R$" + String.format("%.2f", salario);
	}
	
	

}
