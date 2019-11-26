package tw.luchienlin.java.flow;

public class JavaFlow16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rope = 3500;
		int i=1;
		while(rope>3) {
			i++;
			if(rope/Math.pow(2, i)<3) {
				break;
			}		
		}
	System.out.println(i);
	}

}
