package tw.luchienlin.javaoop.inheritance;

class Pokemon{
	public String name = "Pikachu";
	protected String type = "electronic";
	private int power = 3000;
	
	//寫取得能力值的方法，因為這個是private
	public int getPower() {
		return power;
	}
	
	public void getDetails() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(power);
	}
}
class Pichu extends Pokemon{
	//宣告皮丘是寶可夢
	
}
public class Javainheritance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			實體化皮丘這個類別
			Pichu p1 = new Pichu();
//			修改p1寶可夢名字
			p1.name = "pichu";
			//拿取能力值
			p1.getPower();
			int pichupower = p1.getPower();
			System.out.println("pichu power: "+pichupower);
			
			if(pichupower < 3000) {
				System.out.println("不要進化");
			}else {
				System.out.println("進化為皮卡丘");
			}
			
			
		

	}

}
