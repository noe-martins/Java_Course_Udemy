package entities;

public class Aluno extends Pessoa{
	
	Double notaSemestreA, notaSemestreB;

	public Aluno(String nome, Double notaSemestreA, Double notaSemestreB) {
		super(nome);
		this.notaSemestreA = notaSemestreA;
		this.notaSemestreB = notaSemestreB;
	}

	public Double getNotaSemestreA() {
		return notaSemestreA;
	}

	public void setNotaSemestreA(Double notaSemestreA) {
		this.notaSemestreA = notaSemestreA;
	}

	public Double getNotaSemestreB() {
		return notaSemestreB;
	}

	public void setNotaSemestreB(Double notaSemestreB) {
		this.notaSemestreB = notaSemestreB;
	}
	
	public Double media() {
		return (this.notaSemestreA + this.notaSemestreB)/2;
	}

}
