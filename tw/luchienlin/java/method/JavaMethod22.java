package tw.luchienlin.java.method;

public class JavaMethod22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{75, 29, 10},{38, 45, 16}};
		arr(a);
	}
	public static void arr(int[][] a) {
		int max = 0;
		int num1 = 0 , num2 = 0;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				max = a[0][0];
				if(a[i][j]>max) {
					max = a[i][j];
					num1 = i;
					num2 = j;
				}
			}
		}
	System.out.println(max);
	System.out.println(num1);
	System.out.println(num2);
	
	
	}
}
