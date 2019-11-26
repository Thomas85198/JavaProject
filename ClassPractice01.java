
public class ClassPractice01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa caa = new Caaa();
		caa.set_num(20);
	}
	//改成內部類別，由於static函數只能存取static類別所以一定要加static
	static class Caaa{
		int num;
		public void set_num(int n) {
			num = n;
			System.out.println("num="+n);
		}
	}
}
