class calNum{
	
	public static int add2n(int n) {
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		
		return total;
	}
}
public class ClassPractice06 {
	public static void main(String arge[]) {
	System.out.println(calNum.add2n(5));
	System.out.println(calNum.add2n(10));
}
}