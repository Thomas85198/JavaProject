package tw.luchienlin.java.abstractclass;

public class JavaAbstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//以父類別呼叫物件指向子類別
		CShape shape1 = new CRectangle(5,10);
		shape1.setColor("Yellow");
		shape1.show(); //指向子類別
		
		CShape shape2 = new CCircle(2.0);
		shape2.setColor("Green");
		shape2.show(); //指向子類別
		
	}

}
