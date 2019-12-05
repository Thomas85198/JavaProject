package tw.luchienlin.java.method;

public class JavaMethod19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {8,6,9,12,47,55,10};
		arr(b);
			
	}
	public static void arr(int a[]) {
		
		for(int i=1; i<a.length; i+=2) {
			System.out.println(a[i]);
		}	
	}
}
