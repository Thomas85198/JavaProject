class Caaa
{
	private int value;
	
	public Caaa() {
		this.value=10;
		System.out.println("value="+value);
	}
	public Caaa(int i) {
		value = i;
		System.out.println("value="+value);
	}
}
public class ClassPractice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
		
	}

}
