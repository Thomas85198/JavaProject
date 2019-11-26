package tw.luchienlin.java.method;

public class JavaMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		add10(num);
		System.out.println("in main(), num="+num);
	}

	public static void add10(int value) {
		value = value + 10;
		System.out.println("in add10(), value = " + value);
	}
}
