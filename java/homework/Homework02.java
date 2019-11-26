package tw.luchienlin.java.homework;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product;
		for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++) {
				product = i * j;
				if(product<10) {
					System.out.print(i+"*"+j+" = "+product+" ");
				}else {
					System.out.print(i+"*"+j+" ="+product+" ");
				}
//				System.out.print(i+"*"+j+" = "+product);
			}
			System.out.print('\n');
		}
	}

}
