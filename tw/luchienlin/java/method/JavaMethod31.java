package tw.luchienlin.java.method;

public class JavaMethod31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(1,5,9));
		System.out.println(max(8,2));
	}
	public static int max(int a, int b) {
		int max = 0;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	public static int max(int a, int b, int c) {
		int max = 0;
		if(a>b && a>c) {
			max = a;
		}else if(b>c && b>a) {
			max = b;
		}else if(c>a && c>b) {
			max = c;
		}
		return max;
	}
}
