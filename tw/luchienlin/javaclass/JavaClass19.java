package tw.luchienlin.javaclass;
class CCircle11{
	double radius;
	int area;
	double area(double r) {
		radius = r;
		return r*r*3.14;
	}
	float area(float f) {
		radius = f;
		return (float) (f*f*3.14); 
	}
	double area(int r) {
		radius = r;
		return (double) (r*r*3.14);
	}
}
public class JavaClass19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle11 a = new CCircle11();
		System.out.println(a.area(2));
		System.out.println(a.area(2.2f));
		System.out.println(a.area(2.2));
		
	}

}
