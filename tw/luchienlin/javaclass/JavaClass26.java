package tw.luchienlin.javaclass;
class CCircle12{
	private static double pi = 3.14;
	private double radius;
	
	public CCircle12(double r) {
		radius = r;
	}
	public void compare(CCircle12 cir) {
		if(this.radius == cir.radius) {
			System.out.println("radius are equal");
		}else {
			System.out.println("radius are not equal");
		}
	}
}
public class JavaClass26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle12 cirl1 = new CCircle12(1.0);
		CCircle12 cirl2 = new CCircle12(1.0);
		System.out.println(cirl1.equals(cirl2));
	}

}
