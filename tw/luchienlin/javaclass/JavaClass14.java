package tw.luchienlin.javaclass;

class CBox {
	int length;
	int width;
	int height;
	
	int volume() {
		return length*width*height;
	}
	int surfaceArea() {
		return 2*((length*width)+(width*height)+(height*length));
	}
	void showData() {
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
	}
	void showAll() {
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
		System.out.println(volume());
		System.out.println(surfaceArea());
	}
}

public class JavaClass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box = new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showData();
		box.showAll();
		
		

	}

}
