
class CCircle{
	private static double pi = 3.14;
	private double radius;
	
	public CCircle(double radius){
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("area ="+pi*Math.pow(radius, 2));
	}
}
public class ClassPractice {

	public static void main(String[] args) {
		//利用類別new一個cir物件為陣列
		//注意陣列每個都要new
		CCircle cir[] = new CCircle[3];
		cir[0] = new CCircle(1.0);
		cir[2] = new CCircle(2.0);
		cir[1] = new CCircle(3.0);
		
		//透過陣列呼叫方法
		cir[0].show();
		cir[1].show();
		cir[2].show();
	}

}
