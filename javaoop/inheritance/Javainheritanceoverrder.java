package tw.luchienlin.javaoop.inheritance;
class Fish{
	
    String name = "nemo";

	public Fish() {		
	}
	
	public Fish(String name) {
		this.name  = name;
	}
	
	public void eat() {
		System.out.println("eat food");
	}
}

class Shark extends Fish{
	
	public Shark() {
		super("Dolly");
	}
	
	@Override
	public void eat() {
		System.out.println("eat human, Seal, Fish:" + name);
	}
}

public class Javainheritanceoverrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shark makoShark = new Shark();
		makoShark.eat();
	}

}
