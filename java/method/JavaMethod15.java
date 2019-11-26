package tw.luchienlin.java.method;

public class JavaMethod15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even(100);
	}
	public static void even(int n) {
	for(int i=0; i<n; i++) {
		if(i%9==0) {
			System.out.println(i);
		}
	}
	}
}
