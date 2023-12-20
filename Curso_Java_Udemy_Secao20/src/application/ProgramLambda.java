package application;

interface Rectangle{
	Double area(double weight, double height);
}

public class ProgramLambda {

	public static void main(String[] args) {
		
		Rectangle rec2 = new Rectangle() {
			@Override
			public Double area(double weight, double height) {
				return weight * height;
			}
		};
		
		System.out.println(rec2.area(2.0, 4.0));
	}

}
