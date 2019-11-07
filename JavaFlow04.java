package tw.luchienlin.java.flow;

public class JavaFlow04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, sum=0;
		while(sum<20) {
			System.out.println("n="+n+", sum="+sum);
			n++;
			sum+=n;
		}
		System.out.println(sum);
		System.out.println(n);
	}

}
