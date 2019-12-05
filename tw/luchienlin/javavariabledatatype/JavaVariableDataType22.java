package tw.luchienlin.javavariabledatatype;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JavaVariableDataType22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		double radius;
		radius = Double.parseDouble(JOptionPane.showInputDialog("請輸入半徑："));
		//parseDouble是Java.lang中的一個方法，使字串返回初始化給予一個double值
		double cube = Math.pow(radius, 2) * 4.0 / 3.0 * Math.PI ;
		System.out.println(cube);
	}
}
