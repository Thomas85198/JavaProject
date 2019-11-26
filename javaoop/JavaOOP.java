package tw.luchienlin.javaoop;
class CCircle{
	private double pi = 3.14;
	private double radius;
	//建立建構子
	public CCircle(double r) {
		radius = r;
	}
	public void show() {
		System.out.println("radius="+radius+", area="+pi*radius*radius);
	}
}
public class JavaOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//直接帶入建構子參數
		CCircle cirl1 = new CCircle(4.0);
		
		cirl1.show();
	}

}
