package tw.luchienlin.java.method;

public class JavaMethod24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{2,4,6},{1,3,5},{8,9}};
		arr(a);
	}
	public static void arr(int[][] a) {
		int sum = 0;
		int num = 0;
		for(int i = 0; i<a.length; i++) {
			num += a[i].length;
			for(int j = 0; j<a[i].length ; j++) {
				sum+=a[i][j];
				
			}
		}
	System.out.println(sum);
	System.out.println(num);
	double avg = (double)(sum/num);
	System.out.println(avg);
	}
}
