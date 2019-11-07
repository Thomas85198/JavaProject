package tw.luchienlin.java.homework;

public class HelloWorld {
	 public static void main(String[] args) {
	  String[][] test = { { "A", "B", "C" }, 
	       { "D", "E", "F" }, 
	       { "G", "H", "I" } };
	  for (int i = 0; i < test.length; i++) {
	   for (String val : test[i]) {
	    if (i % 2 != 0) {
	     System.out.println(val);
	    }
	    break;
	   }
	  }
	 }
	}