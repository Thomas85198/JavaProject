package tw.luchienlin.javaclass;
class Circle04{
	String color;
	double pi = 3.14;
	double radius;
	
	void setCircle(String str) {
		color = str;
	}
	void setCircle(double r) {
		radius = r;
	}
	void setCircle(double r, String str) {
		radius = r;
		color = str;
	}
	void show() {
		System.out.println("color="+color+", radius"+radius);
		System.out.println("area="+pi*(Math.pow(radius, 2)));
	}
}
public class JavaClass09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle04 a = new Circle04();
		a.setCircle(3.0,"red");
		a.show();
	}

}
