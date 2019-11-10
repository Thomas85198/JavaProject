package tw.luchienlin.java.flow;

public class JavaFlow13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		for(i = 1; i < 101; i++) {
			sum = sum + i^2;
		}
		System.out.println(sum);
	}

}
