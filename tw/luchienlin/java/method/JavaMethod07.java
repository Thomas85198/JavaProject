package tw.luchienlin.java.method;

public class JavaMethod07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1*2*...*4="+fac(4));
	}
	public static int fac(int n) {
		if(n==0)
			return 1;
		else
			return n*fac(n-1);
	}
}
