package tw.luchienlin.java.homework;
	class TestLottery{
	private int a[] = new int[42];
	
	public void randomNum() {
		for(int i = 1; i<100000; i++) {
			int rnum = (int)(Math.random()*42+1);
//			System.out.println(rnum);
			
			a[rnum -1]++;
		}
	}
	
	public void printResult() {
		for(int j = 0; j < a.length; j++) {
			System.out.println((j+1)+" "+a[j]);		
			}
	}
}
public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestLottery a = new TestLottery();
	a.randomNum();
	a.printResult();
	}


}


