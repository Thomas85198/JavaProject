package tw.luchienlin.javaarray;

import java.io.IOException;
import java.util.Arrays;

public class JavaArray06 {

	public static void main(String args[]) throws IOException {

		int[] arr = { 53, 27, 69, 12, 3, 96 };

		int num = 0, num1 = 0;

		for (int arr1 : arr)

			System.out.println(arr1);

		for (int i = 0; i < arr.length; i++)

			if (arr[i] % 2 == 0)

				num++;

			else

				num1++;

		System.out.println("偶數有:" + num + "個");

		System.out.println("奇數有:" + num1 + "個");

		Arrays.sort(arr);

		System.out.println("最小:" + arr[0]);

		System.out.println("最大:" + arr[arr.length - 1]);

	}

}
