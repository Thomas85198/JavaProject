package tw.luchienlin.javaarray;

public class JavaArray09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a[] = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i =0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		
	}

}
