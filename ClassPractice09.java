class CCircle20{
	protected static double pi = 3.14;
	protected double radius = 30;
	
	public CCircle20() {
		
	}
	
	public CCircle20(double r) {
		radius = r;
	}
	public void show() {
		System.out.println("radius = "+radius);
	}
	
}
class CCoin20 extends CCircle20{
	private int value;
	public double radius = 40;
	
	public CCoin20() {
		super();
	}
	public CCoin20(double r) {
		super(r);
		
	}
	public void show() {
		System.out.println("2radius="+radius);
	}
	public void showValue() {
		System.out.println("value = "+value);
	}
}
public class ClassPractice09 {

	public static void main(String[] args) {
		CCircle20 cirl20 = new CCoin20();
		//宣告父類別的物件，並指向子類別的實體物件
		//複寫仍然會發生
		cirl20.show();
		System.out.println(cirl20.radius);
	
	}

}
