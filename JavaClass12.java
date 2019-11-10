package tw.luchienlin.javaclass;
class Cbbb{
	double x;
	double y;
}
public class JavaClass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb obj1 = new Cbbb();
		obj1.x = 5.2;
		obj1.y = 3.9;
		Cbbb obj2 = new Cbbb();
		Cbbb avg = new Cbbb();
		obj2.x = 6.5;
		obj2.y = 4.6;
		avg.x = (obj1.x+obj2.x)/2;
		avg.y = (obj1.y+obj2.y)/2;
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(avg.x);
		System.out.println(avg.y);
	}

}
