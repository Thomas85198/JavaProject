package tw.luchienlin.javaclass;
class Circle00{
	double pi = 3.14;
	double radius;
	void show_area() {
		System.out.println("radius="+radius);
		System.out.println("area="+pi*radius*radius);
	}
	void setRadius(double r) {
		
		radius=r;
	}
}
public class JavaClass05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle00 a = new Circle00();
		a.setRadius(4.0);
		a.show_area();
		
	}

}
