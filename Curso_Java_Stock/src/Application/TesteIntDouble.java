package Application;

public class TesteIntDouble {

	public static double a;
	public static int b;
	
	public static void main(String[] args) {
		a = 12.5;
		b = 2;
		
		System.out.println(Multi());
	}
	
	public static double Multi() {
		return (a/b);
	}
}
