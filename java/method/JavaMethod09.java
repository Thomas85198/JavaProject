package tw.luchienlin.java.method;

public class JavaMethod09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star();
		System.out.print("\n");
		star(7);
		System.out.print("\n");
		star('@',9);
	}
	public static void star() {
		star(5);
	}
	public static void star(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
	public static void star(char a, int b) {
		for(int i = 0; i < b; i++) {
			System.out.print(a);
		}
	}
}
