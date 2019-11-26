package tw.luchienlin.javaoop.inheritance;
class Color{
//	public Color() {
//		
//	}
	public Color(int a) {
		
		System.out.println(a);
	}
}
class red extends Color{

	public red(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

}

public class colortest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color a = new red(2);
		
		
		
	}

}
