package first;
class Calc
{
	public int add(int...i) //Variable length Argument
	{
		int sum=0;
		for(int k:i)
		{
			sum=sum+k;
		}
		return sum;
	}
}

public class Varargs
{
	public static void main(String[] args) 
	{
		Calc obj= new Calc();
		System.out.println(obj.add(1,2,3,4,5));
	}

}
