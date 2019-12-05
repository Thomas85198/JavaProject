package tw.luchienlin.javaclass;
class Circle05{
	private double pi = 3.14;
	private double radius;
	
	private double area() {
		return pi*Math.pow(radius, 2);
	}
	
	public void show_area() {
		System.out.println("area="+ area());
	}
	public void setRadius(double r) {
		if(r>0)
		{
			radius = r;  //將private設為r
			System.out.println("radius="+radius);
			System.out.println(getRadius());
		}else {
			System.out.println("input error");
		}
	}
	public double getRadius() {
		return radius;
	}
}
public class JavaClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle05 a = new Circle05();
		a.setRadius(5.0);
		double b = a.getRadius();
		System.out.println(b);
		a.show_area();
	}

}
