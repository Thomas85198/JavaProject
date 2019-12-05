package tw.luchienlin.java.homework;

import java.util.Scanner;


public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int number = 0;
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter a number: ");
				number = scanner.nextInt();
				
				if(number == 1) {
					System.out.println("last Fibonacci num = 1");
				} else if(number == 2) {
					System.out.println("last Fibonacci num = 1");
				} else {
					int res = calculate(number);
					System.out.println("last Fibonacci num = "+res);
				}
			}

			private static int calculate(int num) {
				// TODO Auto-generated method stub
				int p1 = 1; //the first number in fibonacci
				int p2 = 1; //the second number in fibonacci
				int res = 0;
				for(int i = 3; i <= num; i++) {
					res = p1 + p2;
					p1 = p2;
					p2 = res;
				}
				
				return res;
			}


}

