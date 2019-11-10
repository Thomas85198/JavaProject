package tw.luchienlin.javaarray;

public class JavaArray00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] a = new int[3];
		a[0]= 9;
		a[1]= 6;
		
		for(i=0;i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]+",\t");
		}
		System.out.println(a.length);
	}

}
