package tw.luchienlin.javaoperator;

public class JavaOperator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int a = 53;
		if(a<0 || a>100) {
			System.out.println("輸入錯誤");
		}
		else if((a<60)&&(a>49)) {
			System.out.println("請補考");
		}
	}

}
