package tw.luchienlin.javavariabledatatype;

import java.util.Scanner;

public class JavaVariableDataType21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int height = src.nextInt();
		int width = src.nextInt();
		int area = height * width;
		System.out.println("長方形面積為："+area);
	}

}
