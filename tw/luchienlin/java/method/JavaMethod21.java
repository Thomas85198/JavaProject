package tw.luchienlin.java.method;

public class JavaMethod21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {75, 29, 38, 45, 16};
		arr(a);
	}
	public static void arr(int[] a) {
		int min = 0;
		int num = 0;
		for(int i = 0; i<a.length; i++) {
			min = a[0];
			if(a[i]<min) {
				min = a[i];
				num = i;
			}
		}
		System.out.println("索引值"+num+"最小值"+min);
	}
}
