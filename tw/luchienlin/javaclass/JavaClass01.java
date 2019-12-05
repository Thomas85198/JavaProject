package tw.luchienlin.javaclass;
class CRectangle2{
	int width;
	int height;
}
public class JavaClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle a = new CRectangle();
		a.width= 20;
		a.height= 15;
		int area = a.area();
		
		System.out.println("area: "+area);
		
	}

}
