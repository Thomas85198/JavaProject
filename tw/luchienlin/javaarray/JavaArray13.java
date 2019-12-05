package tw.luchienlin.javaarray;

public class JavaArray13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {33, 22, 44, 55, 66};
		int temp;
		for(int i=0; i<array1.length; i++){
			for(int j=i+1; j<array1.length; j++) {
				if(array1[j]>array1[i]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
			System.out.println("array:"+array1[i]);
			
		}
	}

}
