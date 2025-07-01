package first;
class A
{
	A()
	{
		System.out.println("In A");
	}
	A(int i)
	{
		System.out.println("In int A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("In B");
	}
	B(int i)
	{
		super(i);//To call parameterized constructor of super class
		System.out.println("In int B");
	}
}
public class SuperDemo 
{
	public static void main(String[] args) 
	{
		/*The object created for sub class contains 
		 * default constructor of super class, and calls the default constructor
		 * of super class
		 */
		B obj = new B(2);
	}
}
