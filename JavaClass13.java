package tw.luchienlin.javaclass;
class Cddd{
	String name;
	double height;
	double weight;
	
	void BMI() {
//		height = h;
//		weight = w;
		double BMI = weight/height*height;
		System.out.println(BMI);
	}
	
	
}
public class JavaClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cddd student = new Cddd();
		student.name="Sandy";
		student.height=165.5;
		student.weight=58.2;
		student.BMI();
		
	}

}
