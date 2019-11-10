package tw.luchienlin.javaclass;
class CCircle{
	double pi=3.14;
	double radius;
	
	void show_area() {
		System.out.println("area="+this.pi*this.radius*this.radius);
	}
}
public class JavaClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle circle1=new CCircle();
		circle1.radius=2.0;
		System.out.println(circle1.pi);
		circle1.show_area();  
		circle1.pi=3.0;
		System.out.println(circle1.pi);
		circle1.show_area();    

	}

}
