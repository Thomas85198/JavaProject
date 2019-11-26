package tw.luchienlin.java.method;

public class JavaMethod18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(5,8));
		System.out.println(min(9,2));
	}
	public static int min(int a, int b) {
		if(a>b) {
			return b;
		}else if(a<b) {
			return a;
		}else {
			return a;
		}
	}
}
