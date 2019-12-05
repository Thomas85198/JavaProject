package tw.luchienlin.java.flow;

import java.util.Scanner;

public class JavaFlow17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);

		int input;
		int cnt = 0;
		int passwd = 6128;

		while (true) {
			System.out.println("請輸入密碼：");
			input = src.nextInt();
			if (input != passwd) {
				if (cnt == 3) {
					System.out.println("密碼超過三次");
					break;
				}
				cnt++;
				continue;
			} else if (input == passwd) {
				System.out.println("歡迎使用本系統");
			}
		}
	}
}
