package tw.luchienlin.java.abstractclass;
interface iShape{
	final double PI = 3.14;
	abstract void setColor(String str);
}
//繼承介面
interface iShape3D extends iShape{
	abstract void area();
}
//寫介面implements
class CCircle4 implements iShape2D{
	
	double radius;
	String color;
	
	public CCircle4(double r) {
		radius = r;
	}
	public void setColor(String color) {
	
		this.color = color;
		System.out.println("color="+this.color);
		
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(PI*Math.pow(radius, 2));
	}
	
}
public class JavaAbstract05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		實作介面宣告物件
		CCircle4 cirl = new CCircle4(2.9);
		cirl.setColor("blue");
		cirl.area();
	}

}
