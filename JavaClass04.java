package tw.luchienlin.javaclass;
class CCCircle{
	double pi = 3.14;
	double radius;
	
	void show_area() {
//		System.out.print("pi="+pi);
		System.out.println("area="+pi*radius*radius);
	}
	void show_all() {
		System.out.println("radius="+radius);
		this.show_area();
	}
}
public class JavaClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCCircle cir1=new CCCircle();
		
		cir1.radius=333;
		cir1.show_all();
	}

}
