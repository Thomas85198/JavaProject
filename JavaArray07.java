package tw.luchienlin.javaarray;

import java.util.Arrays;

public class JavaArray07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 53, 27, 69, 12, 3, 96 };
		int even=0; 
		int odd=0;
		int i;
		for(i=0; i<arr.length; i++) {
			System.out.println("Array value"+arr[i]);
			if(arr[i] % 2 ==0) {
				even++;
			}else {
				odd++;
			}
		}
		Arrays.sort(arr);
		System.out.println("奇數最大值："+arr[0]);
		System.out.println("最大:" + arr[arr.length - 1]);
	
		
		
	}

}
