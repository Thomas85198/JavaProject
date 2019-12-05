package tw.luchienlin.javaclass;
class  Circle02{
	double pi;
	double radius;
	
	double getradius() {
		return radius;
	}
	void setCircle(double p, double r) {
		pi=p;
		radius=r;
	}
}
public class JavaClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle02 a = new Circle02();
		double b = a.getradius();
//		a.setCircle(3.14, 2.9);
		
		System.out.println("radius="+a.getradius());
	}

}
