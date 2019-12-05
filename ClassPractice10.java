class Caaa20{
	private int num;
	public Caaa20(int n) {
		num = n;
	}
	public String toString() {
		String str=Integer.toString(num);
		return str;
	}
}
public class ClassPractice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caaa20 a = new Caaa20(5);
		Caaa20 b = new Caaa20(5);
		Caaa20 c = a;
		boolean br1 = a.equals(b);
		boolean br2 = a.equals(c);
		System.out.println(a.toString());
		System.out.println(c.toString());

}
}