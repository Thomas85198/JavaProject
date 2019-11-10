package tw.luchienlin.javaclass;
class Circle01{
	double pi;
	double radius;
	
	void show_area() {
		System.out.println("area="+pi*radius*radius);
	}
	void setCircle(double p,double r) {
		pi = p;
		radius = r;
	}
}
public class JavaClass06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle01 a = new Circle01();
		a.setCircle(3.14, 2.4);
		a.show_area();
		
	}

}
