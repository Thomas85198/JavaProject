package tw.luchienlin.javaarray;

public class JavaArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
//		int[] a = new int[6];
		int a[] = {62,7,12,3,8,47};
		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
			sum+=a[i];
		}
		System.out.println("Average:"+(float)(sum/a.length));
	}

}
