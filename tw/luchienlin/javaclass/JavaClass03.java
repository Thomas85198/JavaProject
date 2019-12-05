package tw.luchienlin.javaclass;

public class JavaClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle a = new CCircle();
		CCircle b = new CCircle();
		
		a.radius = b.radius = 2.0;
		b.pi=3.0;
		
		a.show_area();
		b.show_area();
		
		System.out.println(a);
		System.out.println(b);
		a = b;
		System.out.println(a);
		System.out.println(b);
		
		a.show_area();

		
		
	}

}
