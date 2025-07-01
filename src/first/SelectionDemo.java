package first;

public class SelectionDemo {
	
	public static void main(String[] arg)
	{
		String n= "Teja";//Based on the input it should print 
		//switch supports int,char, and string(above java 1..7) and not double
		switch(n)
		{
		case "abc":
			System.out.println("one");
			break;// jump out of the switch
		case "sravani":
			System.out.println("two");
			break;
		case "anil":
			System.out.println("three");
			break;
		case "java":
			System.out.println("four");
			break;
		case "Maanya":
			System.out.println("five");
			break;
		default:
			System.out.println("Not in list");
		}

		
	}

}
/*	public static void main(String[] arg) //if else
{
int n=0;// check how to get the input from the user
if (n==0)
{
	System.out.println("nothing");
	System.out.println("Bye");
}// whenever we have more than one statement keep it in curly braces
else if (n%2==0)
	System.out.println("even");
else 
	System.out.println("odd");
}*/
//=======================================================
/*//ternary operator ?:->
//condition?expr1:expr2
int i=5;
int j=0;
//if(i>6)
//	j=1;
//else
//	j=2;
j=i>6?1:2;

System.out.println(j);*/