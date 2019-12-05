package tw.luchienlin.java.method;

public class JavaMethod25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,4,8},{2,9,5},{6,3}};
		arr(a);
	}

	public static void arr(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) Math.pow(a[i][j],2);
				System.out.print(a[i][j]+",");
			}
		}
	}
}
