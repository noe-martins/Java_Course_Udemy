package application;

interface Rectangle{
	Double area(double weight, double height); //ÚNICO MÉTODO ABSTRATO
}

public class ProgramLambda {

	public static void main(String[] args) {
		
		Rectangle rec2 = (weight, height) -> weight * height;
		
		System.out.println(rec2.area(2.0, 4.0));
	}

}
