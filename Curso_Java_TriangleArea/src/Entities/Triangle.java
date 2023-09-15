package Entities;

public class Triangle {
	// Atributos
	private double ladoA, ladoB, ladoC;

	// Métodos Especiais
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	
	public double area() {
		double p, area;
		
		p = (this.getLadoA() + this.getLadoB() + this.getLadoC())/2;
		area = Math.sqrt(p*(p - this.getLadoA())*(p - this.getLadoB())*(p - this.getLadoC()));
		
		return area;
	}
	
}
