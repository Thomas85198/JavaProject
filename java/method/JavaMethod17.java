package tw.luchienlin.java.method;

public class JavaMethod17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abs(-5));
		System.out.println(abs(2));
		System.out.println(abs(0));
	}
	public static int abs(int x) {
		if(x<0) {
			return -x;
		}else if(x==0) {
			return 0;
		}else {
			return x;
		}
	}
}
