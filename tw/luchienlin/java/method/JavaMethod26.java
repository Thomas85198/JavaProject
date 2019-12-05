package tw.luchienlin.java.method;

public class JavaMethod26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {75, 29, 10, 38, 45, 17};
		int avg = (int) avg(arr) ;
		System.out.println(avg);
	}

	public static double avg(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum += arr[i];
		}
		return sum/arr.length;
		
	}
}
