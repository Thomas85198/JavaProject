package tw.luchienlin.java.Stringtest;

public class JavaString00 {

	public static void main(String[] args) {
		String str = "Easier said than done.";
		
		System.out.println("length="+str.length());//取出字串的長度，包括空白
		System.out.println("charAt(8)="+str.charAt(8));//取出第8個字元，從0開始包括空白
		System.out.println("sub string="+str.substring(7));//取出第7個字元開始值之後的
		System.out.println("start with\"th\"="+str.startsWith("th")); //是否有th開頭的字如果沒有印出false
		System.out.println("upper case = "+str.toUpperCase()); //改成大寫
		str = "Taiwan said than down";

	}

}
