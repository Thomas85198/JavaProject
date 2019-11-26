package tw.luchienlin.javaoop;
class CCircle01{
	private String color;
	private double pi=3.14;
	private double radius;
	
	public CCircle01() {
		System.out.println("constructor CCircle01()");
		color="Green";
		radius=1.0;
	}
	public CCircle01(String str, double r) {
		System.out.println("String double called");
		color=str;
		radius=r;
	}
	public void show() {
		System.out.println("color"+color+", "+radius);
		System.out.println(pi*radius*radius);
	}
	
}
public class JavaOOP01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle01 cirl1 = new CCircle01();
		cirl1.show();
		CCircle01 cirl2 = new CCircle01("Blue", 2.0);
		cirl2.show();
	}

}
