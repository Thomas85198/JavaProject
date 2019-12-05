package tw.luchienlin.java.Stringtest;

public class JavaString01 {

	public static void main(String[] args) {
		//StringBuffer用於新增修改做一些String做不到的
		StringBuffer str = new StringBuffer("Black & White");
		//str = "Taiwan"; //StringBuffer不能這樣改
		System.out.println(str);
		System.out.println("length="+str.length()); //StringBuffer的長度
		System.out.println(str.replace(0,5,"cats")); //0-5個字元置換成cats
		System.out.println(str.replace(7, 12, "dogs"));//7-12個字元置換成dogs
		System.out.println(str.reverse());//全部反過來寫
		System.out.println(str);//str已變成反過來寫
		
		
	}

}
 