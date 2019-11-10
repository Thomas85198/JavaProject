package tw.luchienlin.javaarray;

public class JavaArray08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3,5,0,3,2,4,1,6,8,5,4,3,2};
		System.out.println("array個數:"+array.length);
		int i, num=0;
		for(i=0; i<array.length; i++) {
			if(array[i]<=6 && array[i]>=3 ) {
				num++;
			}
		}
		System.out.println(num);
	}

}
