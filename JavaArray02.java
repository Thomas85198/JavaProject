package tw.luchienlin.javaarray;

public class JavaArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, max, min;
		int a[]= {74, 48, 30, 17, 62};
		min=max=a[0];
		System.out.print("Elements in array a are ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("\n最大值："+max);
		System.out.println("最小值："+min);
	}

}
