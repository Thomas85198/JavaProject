package tw.luchienlin.javavariabledatatype;

import java.util.Scanner;

public class JavaVariableDataType11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String name;
		int age;
		char ch;
		
		System.out.print("what's your name?");
		name=scn.nextLine();
		ch=name.charAt(0);
		System.out.println(ch);
		System.out.print("How old are you?");
		age=scn.nextInt();
		
		System.out.print("Hi, "+name+", you're");
		System.out.print(age+"years old.");
	}

}
