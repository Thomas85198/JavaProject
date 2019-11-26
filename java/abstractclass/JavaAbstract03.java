package tw.luchienlin.java.abstractclass;
interface iShape2D //定義介面
{
	final double PI = 3.14; //給初始值但這值不能改
	void area(); //abastract可以省略 直接寫這樣即可
}
interface iColor
{
	abstract void setColor(String str);
}
class CCircle2 implements iShape2D, iColor{
	//CCircle實作iShape2D
	double radius;
	String color;
	public CCircle2(double r) {
		radius = r;
	}
	public void area() {
		//定義area函式
		System.out.println("area="+PI*radius*radius);
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color=color;
		System.out.println("color "+color);
	}
}
public class JavaAbstract03 {
	
	public static void main(String[] args) {
		CCircle2 cir = new CCircle2(2.0);
		cir.setColor("blue");
		cir.area();
	}
}
