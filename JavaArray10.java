package tw.luchienlin.javaarray;

public class JavaArray10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
