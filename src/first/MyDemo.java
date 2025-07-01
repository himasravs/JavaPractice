package first;
public class MyDemo
{
	int i,j,k, sum;
	String name = "java";
	double d1,d2;

	public void add(int i, int j)
	{	sum=i+j;
		System.out.println(" Inside Medthod1(int,int) the sum is "+ sum);
	}
	public void add(int i, int j, int k)//Method Overloading
	{	sum=i+j+k;
		System.out.println(" Inside Medthod2(int,int,int) the sum is "+ sum);
	}
	public void add(double d1, double d2)//Method Overloading
	{	sum =(int) (d1+d2); // Explicit Type casting
		System.out.println(" Inside Medthod3(d,d) the sum is "+ sum);
	}
/*in MethodOverloading, it has return type, it exposes the state of an object
 * invoked explicitly
 */
public static void main(String[] args) // Main method in the same class
{ 
	MyDemo obj1 = new MyDemo();
	obj1.add(2.5, 5.3);//7
	obj1.add(1, 2);//3
	obj1.add(2, 2,2);//6
}
}			
