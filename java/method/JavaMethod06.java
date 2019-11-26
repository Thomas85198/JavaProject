package tw.luchienlin.java.method;

public class JavaMethod06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = { { 18, 32, 65, 27, 30 }, { 17, 56, 12, 66 } };
		int B[][];// 呼叫一個B的空陣列
		B = add10(A);
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j] + " ");

			}
		System.out.println();
		}
		
	}

	public static int[][] add10(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] += 10; // arr[i][j]每個值+10
			}
		}
		return arr;
	}

}
