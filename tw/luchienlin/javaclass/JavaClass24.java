package tw.luchienlin.javaclass;
class CCircle09{
	private static double pi = 3.14;
	private double radius;
	
	public CCircle09(double r)
	{
		radius = r;
	}
	public void show() {
		System.out.println("area="+pi*radius*radius);
	}
}
public class JavaClass24 {

	public static void main(String[] args) {
		CCircle09 cirl1, cirl2; //宣告兩個CCircle09類別的物件cirl1, cirl2
		cirl1 = new CCircle09(1.0); //建立物件並向cirl1指向pi類別變數與CCircle09()實例函數
		cirl1.show();
		
		cirl2=cirl1; //此時兩個記憶體位子相同;
		System.out.println(cirl1);
		System.out.println(cirl2);
		cirl2.show();
	}

}
