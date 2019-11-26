package tw.luchienlin.java.method;

public class JavaMethod13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addto(10));
	}
	public static int addto(int n) {
		int sum = 0;
		for(int i=1; i<n+1; i++) {
			sum+=i;
		}
		return sum;		
	}
}
