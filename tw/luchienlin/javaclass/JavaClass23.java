package tw.luchienlin.javaclass;
class CCircle08{
	private int count=0;
	private static double pi = 3.14;
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public CCircle08() {
		this(1.0);//這個會傳入讓count++
		
	}

	public CCircle08(double d) {
		radius = d;
		count++; 
	}
	
	public void show() {
//		CCircle08 circle = new CCircle08();//可以類別裡面自行宣告類別的方法，一樣先new
//		circle.show();
		System.out.println(pi*radius*radius);
		count++;
		
	}
	public void show_count() {
		System.out.println(this.count+"object(s) created");
	}
}
public class JavaClass23 {

	public static void main(String[] args) {
		CCircle08 circle = new CCircle08(); // count=1
		circle.show_count(); 
		CCircle08 circle2 = new CCircle08(2.0); // count = 2
//		CCircle08 circle3 = new CCircle08(4.3); // count = 3
		circle.show_count();
		circle2.show_count();
		circle2.show();
		circle2.setRadius(2.0);
		double jfiejfiefj = circle2.getRadius();
//		circle3.show_count();
	}

}
