package tw.luchienlin.java.method;

public class JavaMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = star(20);
		System.out.println(i+"star printed");
	}
	public static int star(int n) {
		int i;
		for(i=0;i<2*n;i++) {
			
			System.out.print("*");
		}
		System.out.print("\n");
		
		return 2*n;	
	}
}
