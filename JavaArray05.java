package tw.luchienlin.javaarray;

public class JavaArray05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {18, -51, 23, 35, 10, 9, -3, 52, 81, 69};
		int b[] = {28, 32, -35, 40, 73, 17, 92, 32, 13, 29};
		int i, j = 0, sum=0;
		for(i=0; i<a.length; i++) {
			for(j=0;j<b.length; j++) {
				sum=a[i]*b[9-j];
			}
		}
		System.out.println(a[i]+"*"+b[9-j]+"="+sum);
	}

}
