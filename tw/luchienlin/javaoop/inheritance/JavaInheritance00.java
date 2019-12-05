package tw.luchienlin.javaoop.inheritance;

class Employee{
	public String name = "Thomas";
	protected String addess = "Taiwan"; //讓有繼承的可以看得到，但是不能Universe
	String phone = "0987654321";
	private int salary = 23000;
	
	public int getSalary() {
		return salary;
	}
	
	public void getDetails() {
		System.out.println("name=" + name);
		System.out.println("addess=" + addess);
		System.out.println("phone=" + phone);
	}	
}
class Engieer extends Employee{
	//上面的東西不用再寫
	String name ="Th";
//	public void getDetails() {
//		
//		System.out.println(name);
////		System.out.println(salary); //private看不到
//			
//	}
	
	
}

public class JavaInheritance00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eg1 = new Engieer();
		Engieer eg2 = new Engieer();
		System.out.println(eg1.name);
		eg1.getDetails();
//		System.out.println(eg1);
//		System.out.println(eg2);
//		eg1 = eg2;
//		System.out.println(eg2==eg1);
//		eg1.Stringcompare();
		
	}
	
	public void test() {
		Employee ep1 = new Employee();
		ep1.getDetails();
	}

}
