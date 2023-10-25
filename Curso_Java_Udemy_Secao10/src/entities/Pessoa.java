package entities;

public class Pessoa {
	//Atributos
	String nome;
	String genero;
	String email;
	int idade;
	Double altura;
	
	//Construtores
	public Pessoa(String genero, Double altura) {
		if (!genero.equalsIgnoreCase("m") && !genero.equalsIgnoreCase("f")) {
			this.genero = "INDEFINIDO";
		} else {
			this.genero = genero;
		}
		this.altura = altura;
	}
	public Pessoa(String nome, int idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.nome = email;
	}
	
	//Special Methods
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String isGenero() {
		return genero;
	}
	private void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
