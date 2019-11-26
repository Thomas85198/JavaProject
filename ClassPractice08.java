class CCircle222{
	private static double pi = 3.14;
	private double radius;
	
	public CCircle222() {
		System.out.println("CCircle() constructor called");
	}
	public CCircle222(double r) {
		radius = r;
	}
	public void setRadius(double r) {
		radius = r;
		System.out.println("radius="+radius);
	}
	public void show() {
		System.out.println("area = "+pi * radius * radius);
	}
}
class CCoin extends CCircle222{
	private int value;
	public CCoin() {
		System.out.println("CCoin() constructor called");
	}
	public CCoin(double r, int v) {
		super(r); //呼叫父親的建構子
		value = v;
		System.out.println("CCoin建構子被呼叫");
	}
	public void setValue(int t) {
		value = t;
		System.out.println("value "+value);
	}
	
}
public class ClassPractice08 {

	public static void main(String[] args) {
		CCoin coin = new CCoin();
		CCoin coin2 = new CCoin(2.5, 10);
		coin.setRadius(2.0);
		coin.show();
		System.out.println("------                                                          ");
		coin2.show();
		//private只能透過父類別所設定好的方法呼叫
		coin.setValue(5);
		
		
	}

}
