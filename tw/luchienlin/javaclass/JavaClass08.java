package tw.luchienlin.javaclass;
class Circle03{
	String color;
	double pi = 3.14;
	double radius;
	
	void setColor(String str) {
		color=str;
	}
	void setRadius(double r) {
		radius = r;
	}
	void setAll(String str, double r) {
		color = str;
		radius = r;
	}
	void show() {
		System.out.println("color="+color+", Radius="+radius);
		System.out.println("area="+pi*radius*radius);
	}
}
public class JavaClass08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle03 a = new Circle03();
		
		a.setColor("Red");
		a.setRadius(22);
		a.setAll("blue",2);
		a.show();
		
	}

}
