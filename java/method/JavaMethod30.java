package tw.luchienlin.java.method;

public class JavaMethod30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(triangle(6,3));
		System.out.println(triangle(4.2f,3.3f));
		
	}
	public static float triangle(float base, float height) {
		return (base*height)/2;
	}
}
