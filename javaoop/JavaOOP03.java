package tw.luchienlin.javaoop;

class CCircle03 {
	private String color;
	private double pi = 3.14;
	private double radius;

	private CCircle03() {
		System.out.println("私有建構子");

	}
	public CCircle03(String str, double r) {
		this();//呼叫沒有引數的建構子
		color=str;
		radius=r;
	}
	public void show() {
		System.out.println(color+radius);
		System.out.println(Math.pow(radius, 2));
	}
}

public class JavaOOP03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle03 cirl03 = new CCircle03("red", 1.0);
		cirl03.show();
	}

}
