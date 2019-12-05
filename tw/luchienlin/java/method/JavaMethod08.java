package tw.luchienlin.java.method;

public class JavaMethod08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b[] = {1,2,3,4};
		show(a);
		show(b); 
	}
	public static void show(int a) {
		System.out.println("value "+ a);
	}
	public static void show(int arr[]) {
		System.out.print("array=");
		for(int i = 0; i<arr.length; i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	

}
