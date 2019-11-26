package tw.luchienlin.java.method;

public class JavaMethod04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = { 9, 14, 6, 18, 2, 10 };
		largest(score);
	}

	public static void largest(int arr[]) {
		int max = arr[0];// 將第0位設為最大值
		// 跑一次for迴圈
		for (int i = 0; i < arr.length; i++) {
			// 當遇到的數arr[i]>arr[0]則交換
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("最大值=" + max);// 印出最大值

	}
}
