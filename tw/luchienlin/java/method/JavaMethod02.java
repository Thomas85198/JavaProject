package tw.luchienlin.java.method;

public class JavaMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = show_length(8,4);
		System.out.println("對角線長度"+length);
	}
public static double show_length(double m, double n) {
 
	return Math.sqrt(Math.pow(m, 2)+Math.pow(n, 2));
	
}
}
