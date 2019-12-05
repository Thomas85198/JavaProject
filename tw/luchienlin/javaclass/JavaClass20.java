package tw.luchienlin.javaclass;

class CCircle05{
	private String color;
	private double pi = 3.14;
	private double radius;
	
	public CCircle05() {
		System.out.println("constructor CCircle05() called");
		color="Green";
		radius = 1.0;
	}
	public CCircle05(String str, double r) {
		System.out.println("constructor CCircle05(String, double) called");
		color = str;
		radius = r;
	}
	public void show() {
		System.out.println("color ="+color+", Radius="+radius);
		System.out.println("area ="+pi*radius*radius);
	}
}


public class JavaClass20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle05 circle1 = new CCircle05();
		circle1.show();
		CCircle05 circle2 = new CCircle05("Blue", 5.0);
		circle2.show();
	}

}
