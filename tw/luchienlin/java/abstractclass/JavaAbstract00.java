package tw.luchienlin.java.abstractclass;
//定義抽象類別
abstract class CShape
{
	protected String color; //field
	public void setColor(String str) {//function 
		color = str;
	}
	public abstract void show(); //abstract function
}
//定義子類別
class CCircle extends CShape{
	protected double radius;
	public CCircle(double r) {
		radius = r;
	}
	@Override
	public void show() { //
		// TODO Auto-generated method stub
		System.out.print("color="+color+", ");
		System.out.println("area="+3.14*radius*radius);
	}
	
}
class CRectangle extends CShape{
	protected int width, height;
	public CRectangle(int w, int h) {
		width = w;
		height = h;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("color="+color+", ");
		System.out.println("area="+width*height);
	}
}
public class JavaAbstract00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle rect = new CRectangle(5,10);
		rect.setColor("Yellow");		
//		System.out.println(rect.width);
		rect.show();
		
		CCircle cir = new CCircle(2.0);
		cir.setColor("green");
		cir.show();
	}

}
