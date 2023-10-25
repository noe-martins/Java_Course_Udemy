package entities;

public class Reserva extends Pessoa{
	
	int quarto;
	
	public Reserva(String nome, String email, int quarto) {
		super(nome, email);
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return quarto + ": " + nome + ", " + email;
	}
	
	
	
}
