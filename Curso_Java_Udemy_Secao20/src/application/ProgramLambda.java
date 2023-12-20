package application;

interface Rectangle{
	Double area(double weight, double height);
}

class CalculoArea implements Rectangle{
	@Override
	public Double area(double weight, double height) {
		return weight * height;
	}
}

public class ProgramLambda {

	public static void main(String[] args) {
		CalculoArea rec = new CalculoArea();
		System.out.println(rec.area(2.0, 4.0));
	}

}
