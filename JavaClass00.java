package tw.luchienlin.javaclass;

class CRectangle{
	int width;
	int height;
	
	int area() {
		return width*height;
	}
	int perimeter() {
		return 2*(width+height);
	}
}

public class JavaClass00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle rectangel = new CRectangle();
		rectangel.width=10;
		rectangel.height=20;
		int a = rectangel.area();
		System.out.println(a);
		
	}

}
