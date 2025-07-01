package first;

public class IterationDemo {

	public static void main(String[] args) {
		
	// while - while it is true, executes stmt infinte times, we need counter, to make ot finite
	//Do while - executes at least once
	// for - if we know starting point and ending point go for loop
	// for each(enhanced for loop) used in arrays
		for (int k=1;k<=5;k++)
		{
		for (int i=1;i<=4; i++)
		{
			
			for (int j=1;j<=4;j++)
			{
				if(i==1 || i==4)
				{
				System.out.print("$");
				}
				else 
				{
					if(j==1||j==4)
					{
						System.out.print("$");
					}
					else
					{
						System.out.print(" ");
					}				
				}
			}
			System.out.println();
		}
		System.out.println();
		}
	}

}
/*		int i=6;//initialization
while(i<=5)//condition
{
	System.out.println("hello");
	i++;//increment or decrement
}
*/
//======================================
/*		int i=1;
do
{
	System.out.println("hello");
	i++;
}while(i<=5);
		for (int i=1;i<=5; i++)
		{
			System.out.println("hello");
		}*/