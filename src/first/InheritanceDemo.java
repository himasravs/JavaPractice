package first;
class Calci
{
	public int add(int i, int j)
	{
		System.out.println("Inside Calsi");
		return i+j;
	}
}
class NewCalsi extends Calci // The sub class includes new feature called sub
{
	public int sub(int i, int j)
	{
		System.out.println("Inside NewCalsi");
		return i-j;
	}
}
class AdvNewCalsi extends NewCalsi// Multi-Level Inheritance
{
	public int mul(int i, int j)
	{
		System.out.println("Inside AdvNewCalsi");
		return i*j;
	}
}
public class InheritanceDemo 
{
	
	
	public static void main(String[] args)
	{
		System.out.println("im out");
		//System.out.println(obj.add(1,2));
		//System.out.println(obj.sub(5,1));
		//System.out.println(obj.mul(3,6));
	}
}
