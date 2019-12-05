package tw.luchienlin.java.flow;

public class JavaFlow07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50, b=20;
		char oper= '*';
		switch(oper) 
		{
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
//				System.out.println(a*b);
//				break;
			case '/':
				System.out.println((float)a/b);
//			default:
//				System.out.println("unknown");
		}
	}

}
