package Entities;

public class Retangle {
	//Attributes
	private double width, height;
	
	//Special Methods
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//Methods
	public double Area() {
		return (this.getWidth() * this.getHeight());
	}
	public double Perimeter() {
		return (this.getHeight() * 2) + (this.getWidth() * 2);
	}
	public double Diagonal() {
		return (Math.sqrt(Math.pow(this.getWidth(), 2) + Math.pow(this.getHeight(), 2)));
	}
}
