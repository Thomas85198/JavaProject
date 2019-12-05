class CBox{
	private int length;
	private int width;
	private int height;
	
	public CBox(int l, int w, int h)
	{
		length = l;
		width = w;
		height = h;
	}
	public void show() {
		System.out.println("length"+length);
		System.out.println("width"+width);
		System.out.println("height"+height);
	}
}
public class ClassPractice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox c = new CBox(2, 2, 2);
		c.show();
	}

}
