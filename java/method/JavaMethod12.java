package tw.luchienlin.java.method;

public class JavaMethod12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = cub(2);
		System.out.println("i="+cub(3));
	}
public static int cub(int x){
	return (int) Math.pow(x, 3);
}
}
