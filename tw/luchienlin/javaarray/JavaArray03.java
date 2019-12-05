package tw.luchienlin.javaarray;

public class JavaArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j, sum=0;
//		int[][] sales = new int[2][4];
		int sales[][]= {
				{32,35,26,30},
				{34,30,33,31}
		};
		for(i=0;i<sales.length;i++) {
			System.out.println("業務員"+(i+1)+"的業績分別為");
			for(j=0;j<sales[i].length;j++) {
				System.out.print(sales[i][j]+" ");
				sum+=sales[i][j];
			}
			System.out.println(sum);
		}
	}

}
