package tw.luchienlin.java.homework;

import java.text.DecimalFormat;

public class Homework01 {
//	static double temp;
//為什麼temp放在外面要有=0，如果println（在if else外面的話）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree, index;
		index=2;
		degree=89;
		double temp=0;
	    DecimalFormat formatter = new DecimalFormat("##.##");
		if(index==1) {
			temp = (9.0/5.0*degree+32); 
//			System.out.println(formatter.format(temp));
		}else if(index==2) {
			temp = ((degree-32)*5.0/9.0);
//			System.out.println(formatter.format(temp));
		}
		System.out.println("degree="+degree);
		System.out.println("temp="+temp);
	}

}
