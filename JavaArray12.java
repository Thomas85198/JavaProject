package tw.luchienlin.javaarray;

public class JavaArray12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sell1[][] = new int[3][];
//		sell1[0] = new int[5];
		int sell1[][]= {{33,32,56,45,33}, {77,33,68,45,23},{43,55,43,67,65}};
//	    sell1[1] = new int[5];
		int sum1 = 0 ,sum2=0 ,sum3 = 0;
		for(int i =0; i<sell1[0].length; i++) {
			sum1 += sell1[0][i];
		}
		System.out.println(sum1);
	    
		
	}

}
