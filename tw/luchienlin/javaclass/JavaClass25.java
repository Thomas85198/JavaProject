package tw.luchienlin.javaclass;
class CCircle10{
	private static double pi=3.14;
	private double radius;
	
	public CCircle10(double r) {
		radius=r;
	}
	public void setRadius(double r) {
		radius=r;
	}
	public void show(){
		System.out.println("area="+pi*radius*radius);
	}
}
public class JavaClass25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle10 cirl1, cirl2;
		cirl1 = new CCircle10(1.0);
		cirl1.show();
		cirl2 = cirl1;
		cirl2.setRadius(2.0);
		cirl1.show();
	}

}
