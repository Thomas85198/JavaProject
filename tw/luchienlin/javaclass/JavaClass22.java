package tw.luchienlin.javaclass;
class CCircle07{
	private String color="taiwan";
	private double pi = 3.14;
	private double radius;
	
	private CCircle07() {
		System.out.println("private constructor called");
	}
	public CCircle07(String str, double r) {
//		this(); //呼叫沒有引數private建構子
		color=str;
		radius=r;
		System.out.println(this.color);
	}
	public void show() {
		System.out.println(color+radius);
		System.out.println(pi*radius*radius);
	}
}
public class JavaClass22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle07 circle1 = new CCircle07("taipei", 1.0);
//		circle1.show();

	}

}
