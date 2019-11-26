package tw.luchienlin.javaoop;
class CCircle02{
	private String color;
	private double pi = 3.14;
	private double radius;
	
	public CCircle02() {
		this("Green", 1.0);//呼叫有這個引數的建構子
		System.out.println("建構子呼叫");
	}

	public CCircle02(String str, double r) {
		// TODO Auto-generated constructor stub
		System.out.println("有引數的建構子呼叫");
		color = str;
		radius = r;
	}
	public void show() {
		System.out.println(color+radius);
		System.out.println(pi*Math.pow(radius, 2));
	}

}
public class JavaOOP02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle02 cir1 = new CCircle02();
		cir1.show();
	}

}
