package tw.luchienlin.java.method;

public class JavaMethod16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(2.0));
	}
	public static double area(double r) {
		double radius = r;
		double pi = 3.14;
		return Math.pow(radius, 2)*pi;
		
	}
}
