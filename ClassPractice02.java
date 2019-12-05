class Crectangle{
	int width;
	int height;
	
	public Crectangle(int w, int h) {
	width = w;
	height = h;
	}
	public Crectangle() {
		this(10,8);
		System.out.println("constructor called");
	}
	public void getArea() {
		System.out.println("area"+width*height);
	}
}
public class ClassPractice02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crectangle rec1 = new Crectangle();
		System.out.println("width"+ rec1.width);
		System.out.println("height"+ rec1.height);
		
		
	}

}
