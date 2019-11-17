class Gyarados{
	public String name = "Gyarados";
	private String color = "blue";
	
	public Gyarados() {
		System.out.println("Gyarados is a Dragon pokemon");
	}
	public Gyarados(int lv) {
		System.out.println("Your Level is "+ lv);
	}
	public String getColor() {
		return color;
	}
	public String setColor(String c) {
		
		color = c;
		
		return color;	
	}
	public void show() {
		System.out.println("This is one"+color+"Gyarados");
	}
}
class RedGyarados extends Gyarados{
	public RedGyarados() {
		super(99);
		System.out.println("RedGyarados is unique in pokemon world");
	}
	protected String color = "red";
	public String setColor(String c) {
		color = c;
		return color;
	}
	public void show() {
		System.out.println("This is one2"+color+"Gyarados");
	}
}
public class ClassPractice11 {

	public static void main(String[] args) {
		//父類別宣告寶可夢物件並指向子類別
		Gyarados pokemon = new RedGyarados();
		System.out.println(pokemon.getColor()); //父類別blue
		pokemon.setColor("Yellow");
		pokemon.show();//複寫成立
		System.out.println("===========================");
		//父類別宣告寶可夢2物件並指向父類別
		Gyarados pokemon2 = new Gyarados();
		System.out.println(pokemon2.getColor());//父類別blue
		pokemon2.setColor("Green");
		pokemon2.show();//不受複寫影響，畢竟參考父類指向父類別的物件
		System.out.println("===========================");
		//子類別宣告寶可夢3物件並指向子類別
		RedGyarados pokemon3 = new RedGyarados();
		System.out.println(pokemon3.color); //子類別red
		pokemon3.setColor("purple");
		pokemon3.show(); //複寫成立
		System.out.println("===========================");
		
	}

}
