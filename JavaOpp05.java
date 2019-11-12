package tw.luchienlin.javaoop;
class CCircle05{
	private static int count = 0;
	private static double pi = 3.14;
	private double radius;
	
	public CCircle05(){
		this(1.0);
	}

	public CCircle05(double d) {
		// TODO Auto-generated constructor stub
		radius = d;
		count++;
	}
	public void show() {
		System.out.println(pi*Math.pow(radius, 2));
	}
	public void show_count() {
		System.out.println(count+"object(s) created");
	}
}
public class JavaOpp05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle05 cir1 = new CCircle05();
		cir1.show_count();
		CCircle05 cir2=new CCircle05(2.0);
		CCircle05 cir3=new CCircle05(4.3);
		cir1.show_count();
		cir2.show_count();
		cir3.show_count();
	}

}
