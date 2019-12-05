package tw.luchienlin.javaarray;

public class JavaArray11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][]= {{18.2, 17.3, 15, 13.4},
					   {23.8, 25.1, 20.6, 17.8},
					   {20.6, 21.5, 17.4, 15.7}
		
		};
		int i; 
		int j;
		double sum=0;
		double avg=0;
		double sum1 = 0, sum2 = 0, sum3=0;
		double avg1 = 0, avg2 = 0, avg3=0;
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
				sum+=a[i][j];
			}
		}
		avg = sum/a.length;
		System.out.println("平均"+avg);
		
		for(j=0; j<a[0].length; j++) {
			sum1+=a[0][j];
		}
		avg1 = sum1/a[0].length;
		System.out.println(avg1);
	}

}
