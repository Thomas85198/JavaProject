package tw.luchienlin.java.flow;

import java.util.Scanner;

public class JavaFlow10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		String num = src.next();
		char ch1 = num.charAt(0);
		if(47<ch1 && ch1<58) {
			System.out.println("此字串是數字");
		}else if(64<ch1 && ch1<123) {
			System.out.println("此字元是英文字母");
		}else {
			System.out.println("錯誤輸入");
		}
	}

}
