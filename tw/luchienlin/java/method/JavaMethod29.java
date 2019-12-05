package tw.luchienlin.java.method;

public class JavaMethod29 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 2; i < 6; i++) {
			total += rsum(i);
		}
		System.out.println(total);
	}
	public static int rsum(int n) {
			return (n-1) * n;
	}
}
