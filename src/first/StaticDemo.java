package first;
class Emp{
	int eid;
	int salary;
	static String ceo = "Mahesh";
	
	public void show() {
		System.out.println(eid + ":"+ salary + ":"+ceo);
	}
	static // static blk gets executed when you load the class, class loads first and only once
	{
		ceo="Larry";
		System.out.println("in static");
	}
	public Emp() // constructor gets executed when you create an object
	{
		eid=1;
		salary=3000;
		System.out.println("in constructor");
		
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Emp navin = new Emp();
		navin.eid=8;
		navin.salary=2000; //non static variables should be accessed using object
		//navin.ceo="Mahesh"; // static variables can alos be accessed using objects but class name is prefferd
		//Emp.ceo ="Mahesh";// for this object, im changing the variable
		
		Emp Rahul= new Emp();
		Rahul.eid=5;
		Rahul.salary=3000;
		//Rahul.ceo="Mahesh";
		//Emp.ceo ="Mahesh";
		
		navin.show();
		Rahul.show();
		
		
	}

}
