package tw.luchienlin.javaoop.inheritance.override;
class Pokemon{
	String name = "Pikachu";
		//建構子
		public Pokemon() {
			
		}
		//建構子引述name
		public Pokemon(String i) {
			name = i;
		}
		//能力招式
		public void ability() {
			System.out.println("Thunder!!!");
		}
}
class Pikachu extends Pokemon {
	public Pikachu() {
		//呼叫父類別的皮卡丘
		super("Pikachu");
		//所以可以直接使用name且名字為pikachu因為繼承關係
		System.out.println(name);
	}
	//複寫上一個方法因為方法名稱一樣
	@Override
	public void ability() {
		System.out.println("10 thoundans thunder");
	}
}
public class JavaInheritanceOverride00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p1 = new Pikachu();
		//ability會呼叫子類別的
		p1.ability();
	}

}
