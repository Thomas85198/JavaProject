class CCircle00{
	private static double pi = 3.14;
	private double radius;
	
	public CCircle00(double r) {
		radius = r;
	}
	
	public static double compare(CCircle00 c[]) {
		double max = 0.0;
		for(int i=0; i<c.length; i++) {
			if(c[i].radius>max)
				max=c[i].radius;
	
		}
		return max;
	}
}
public class ClassPractice00 {
	
	public static void main(String[] args) {
		CCircle00 cir[] = new CCircle00[3];
//		要一個一個new
		cir[0] = new CCircle00(3.0);
		cir[1] = new CCircle00(4.0);
		cir[2] = new CCircle00(5.0);
		
		//透過方法比較compare，注意他是static直接寫類別與方法名稱
		System.out.println("最大半徑為："+CCircle00.compare(cir));

	}

}
