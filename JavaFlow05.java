package tw.luchienlin.java.flow;

import java.util.Scanner;

public class JavaFlow05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int n, i=1, sum=0;
		
		do {
			System.out.println("請輸入累加的最大值：");
			n=src.nextInt();
		}while(n<1);
		do {
			sum+=i;
			i++;
			
		}while(i<=n);
		System.out.println("1+2+3+...+n="+sum);
	}

}
