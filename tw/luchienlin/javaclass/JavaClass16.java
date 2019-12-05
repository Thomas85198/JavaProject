package tw.luchienlin.javaclass;

import java.util.Scanner;

class CTest{
	int a;
	void test(int num) {
		a=num;
		if(a==0) {
			System.out.println("此數是0");
		}else if(a%2==0 && a!=0) {
			System.out.println("此數是偶數");
		}else {
			System.out.println("此數是奇數");
		}
	}
}
public class JavaClass16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		CTest b = new CTest();
		b.test(src.nextInt());
	}

}
