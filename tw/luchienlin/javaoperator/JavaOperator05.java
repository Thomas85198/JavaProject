package tw.luchienlin.javaoperator;

public class JavaOperator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int num;
//		System.out.println(num=(a++)-b);
//		System.out.println(num=(-b)*a);
//		System.out.println(num=(a++)+(++b));
//		System.out.println(num=(--a)+(b--));
//		System.out.println(a+=a*(b++));
		System.out.println(b%=a++);
		System.out.println(a);
		System.out.println(b);
	}

}
