package tw.luchienlin.javaclass;

import java.util.Scanner;

class CTest1 {
	int a;

	void test(int num) {
		a = num;
		if (a > 0) {
			System.out.println("此數為正數");
		} else if (a < 0) {
			System.out.println("此數為負數");
		} else {
			System.out.println("此數為零");
		}
	}
}

public class JavaClass17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		CTest1 b = new CTest1();
		b.test(src.nextInt());
	}

}
