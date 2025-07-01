package first;

class Dummy
{
	int num1;
	int num2;
	public void add(int num1, int num2)
	{
		this.num1=num1;// Both are taking the local instance
		this.num2=num2;
	}
	public void display()
	{
		System.out.println(num1+num2);
	}
}
public class ThisDemo
{
	public static void main(String[] args)
	{
		Dummy obj  = new Dummy();
		obj.add(5,2);
		obj.display();
	}
}
