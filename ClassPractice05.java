class CCount{
	
	private int cnt = 0;
	
	public void count() {
		this.cnt++;
	}
	public void setZero() {
		this.cnt = 0;
		
	}
	public void setValue(int n){
		this.cnt = n;
		
	}
	public int getCnt() {
		return this.cnt;
	}
}
public class ClassPractice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount cnt = new CCount();
		int num = cnt.getCnt();
		System.out.println(num);
		cnt.count();
		System.out.println(num);
	
	}

}
