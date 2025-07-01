package first;
class Outer
{
	int a;
	public void show()
	{		
	}
	class Inner
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
}


public class InnerDemo
{
	//create variables and methods
	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		
		/*In order to access inner class we need outer class so Outer.Inner
		 * In order to create the object of inner class we need outer class object
		 */
		Outer.Inner obj1 =   obj.new Inner();
		obj1.display();
	}
}
