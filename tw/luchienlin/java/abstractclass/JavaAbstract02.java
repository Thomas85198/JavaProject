package tw.luchienlin.java.abstractclass;

public class JavaAbstract02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//因為怕所建的物件變多，所以用陣列是較好的方法
		CShape shape[];
		shape=new CShape[2];
		
		shape[0]=new CRectangle(5,10);
		shape[0].setColor("Yellow");
		shape[0].show();
		
		shape[1]=new CCircle(2.0);
		shape[1].setColor("Green");
		shape[1].show();
	}

}
