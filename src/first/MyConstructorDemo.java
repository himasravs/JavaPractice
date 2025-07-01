package first;

class Demo1{
	int i,j,k, sum;
	String name = "java";
	double d1,d2;

	Demo1(int i, int j)
	{	sum=i+j;
		System.out.println(" Inside Constructor1(int,int) the sum is "+ sum);
	}
	Demo1(int i, int j, int k)//Constructor Overloading
	{	sum=i+j+k;
		System.out.println(" Inside Constructor2(int,int,int) the sum is "+ sum);
	}
	Demo1(double d1, double d2)//Constructor Overloading
	{	sum =(int) (d1+d2); // Explicit Type casting
		System.out.println(" Inside Constructor3(d,d) the sum is "+ sum);
	}

}

public class MyConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d = new Demo1(1,2);//3
		Demo1 d1 = new Demo1(1,2,3);//6
		Demo1 d2 = new Demo1(1.5,3.3);//4
	
	}
}

