package tw.luchienlin.javaoop;
class CCircle04{
	private double pi = 3.14;
	private double radius;
	
	public CCircle04(double r) {
		radius = r;
	}
	public void show() {
		System.out.println(pi*Math.pow(radius, 2));
	}
}
public class JavaOOP04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle04 cirl1 = new CCircle04(3.0);
		cirl1.show();
		CCircle04 cirl2 = new CCircle04(2.0);
		cirl2.show();
		
	}

}
