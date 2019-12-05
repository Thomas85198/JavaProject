package tw.luchienlin.javaclass;
class CCalculator{
	int a, b, c;
	void set_value(int x,int y,int z){
		x=25;
		y=3;
		z=7;
		a=x;
		b=y;
		c=z;
	}
	void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	int add() {
		return a+b+c;
	}
	int sub() {
		return a-b-c;
	}
	int mul() {
		return a*b*c;
	}
	int avg() {
		return add()/3;
	}
}
public class JavaClass18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCalculator a = new CCalculator();
		a.set_value(25,3,7);
		double b = a.avg();
		System.out.println(b);
		
	}

}
