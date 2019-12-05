package tw.luchienlin.javaclass;
class CCircle06{
	private String color;
	private double pi = 3.14;
	private double radius;
	
	public CCircle06() {
		this("Green", 1.0);//這邊呼叫下面有引述的建構子
		System.out.println("constructor CCircle06 called");
	}

	public CCircle06(String string, double d) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor CCircle06(String, double) called");
		color=string;
		radius = d;
	}
	public void show() {
		System.out.println("color="+color+", Radius="+radius);
		System.out.println("area="+pi*radius*radius);
	}
	
}
public class JavaClass21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle06 a = new CCircle06();
		a.show();//所以這邊就直接宣告即可，因為引述都已經在類別就做完
	}

}
