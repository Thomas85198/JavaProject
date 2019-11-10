package tw.luchienlin.javaclass;
class CCCCircle{
	double pi = 3.14;
	double radius;
	
	void show_periphery() {
		System.out.println("periphery="+2*this.pi*this.radius);
	}
}
public class JavaClass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCCCircle cir1 = new CCCCircle();
		cir1.radius = 3.0;
		cir1.show_periphery();
	}

}
