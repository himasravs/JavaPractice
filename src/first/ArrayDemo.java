package first;
/*
 *  if we have many variables of same data type we can have it
 *   in one variable called array.
 *   Array starts with index 0 n-1 [0,1,2... n-1]
 *   one dimensional array, 2 dimensional array, jagged array( diff sizes)
 *   In Java arrays are objects , so we have to use new keyword.
 */
class Student
{
	
}
public class ArrayDemo {

	public static void main(String[] args)
	{
		 int d[][]= {{1,5,6,7},  //Jagged Array
				 	{5, 9,3},
				 	{2,7,3,2,1}
			 
	 				};
		 for (int i=0;i<d.length;i++)//row count
		 {
			 for (int j=0;j<d[i].length;j++) // column count
			 {
				 System.out.print("  "+d[i][j]);
			 }
			 System.out.println();
		 }
	}
}
//System.out.println(nums[2]);
//System.out.println(nums[4]);// throws AIOB error
/*for (int i=0; i<=3;i++)// to print all the values
{
System.out.println(nums[i]);
}
*/
/* another way of assigning value
int nums[]= new int[4]; // now values by default are zero
nums[0]=8;
nums[1]=12;
nums[2]=76;
nums[3]=54;
nums[2]=99; // values can be changed 
/*	int nums[]={8,12,76,54};
String name[]= {"Raj","Jack","Rose","Lily"};
for(int i=0;i<=3;i++)
{
	s[i].rollno= nums[i];
	s[i].name= name[i];
	System.out.println(s[i].rollno + "-"+ s[i].name);  
	}
}
/*class Student
{
	 int rollno;
	 String name;
}
public class ArrayDemo {

	public static void main(String[] args)
	{
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		
		Student s[] = {s1,s2,s3,s4};
		int nums[]={8,12,76,54};
		String name[]= {"Raj","Jack","Rose","Lily"};
	}
}
*/
