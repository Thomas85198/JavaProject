import java.util.ArrayList;

public class ArraListsProj {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = new String[3];
		fruits[0]="Mango";
		fruits[1]="Apple";
		fruits[2]="Strawberry";
		System.out.println(fruits[1]);
		String fruits2[] = new String[3];
		fruits2 = fruits;
		System.out.println(fruits2[0]);
		//arraylist flexiable 可以自動增加與縮小
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");
		
		
		fruitList.remove("Strawberry");
		System.out.println(fruitList);
		System.out.println(fruitList.contains("Strawberry"));
		fruitList.clear();
		System.out.println(fruitList);
		
	}

}

