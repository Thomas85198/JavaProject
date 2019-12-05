package tw.luchienlin.java.method;

public class JavaMethod20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {75, 29, 38, 45, 16};
		arr(a);
	}
	public static void arr(int a[]) {
		int min=0;
//		int tmp = 0;
		for(int i = 0; i<a.length; i++) {
			min = a[0];
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
