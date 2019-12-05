package tw.luchienlin.java.method;

public class JavaMethod23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {75, 29, 10, 38, 45, 16};
		arr(a);
	}
	public static void arr(int[] a) {
		int max = a[0];
		int min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}else if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("最大值:"+max+"最小值"+min);
	}

}
