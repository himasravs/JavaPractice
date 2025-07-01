package first;

public class Logics {
	//1.reverse a number
	//2.count the number of digits
	//3.count the even and odd digits in a given number
	//4.find sum of digits in a number
	//5.find whether the number is a palindrome
	//6.find whether the given num is a prime number
	//7.swap 2 numbers using third variable
	//8.swap 2 numbers using + and - operators
	//9.swap 2 numbers using * and / operators
	//10.swap 2 numbers using one single statement
	//11.swap 2 numbers using XOR operators

	public static void main(String[] args) {
		int n = 13; //change the number as per your requirement
		// int count = 0;
		int a =10;
		int b=20;
		int reverse=0;
		int rem = 0;
		int pal=n;
		int count=0;
		System.out.println(" the old values of a and b are"+a+" and "+b);
		//int even = 0;
		//int odd = 0;
		//int sum =0;
		//1.reverse a number
		/*
		 * while(n!=0) {rem=n%10; reverse=reverse*10+rem; n = n/10; }
		 * System.out.println(" The reversed number is "+reverse);
		 */

		//2.count the number of digits
		/*
		 * while(n!=0) { n = n/10; ++count; }
		 * System.out.println(" The total digits in number is "+count);
		 */

		//3.count the even and odd digits in a given number
		/*
		 * while(n!=0) { rem=n%10; if(rem%2==0) { even++; } else { odd++; } n=n/10; }
		 * System.out.println("The total num of even and odd in given num is "
		 * +even+" and "+odd);
		 */

		//
		//4.find sum of digits in a number
		/*
		 * while(n!=0) { rem=n%10; sum=sum+rem; n=n/10; }
		 * System.out.println("the sum of the digits in the given number is"+ sum);
		 */
		//5.find whether the number is a palindrome
			/*	while(n!=0) 
				{
					rem=n%10; 
					reverse=reverse*10+rem;
					n = n/10; 
				}
				System.out.println(" The given number is "+pal);
				 System.out.println(" The reversed number is "+reverse);
				 if(pal==reverse)
				 {
				System.out.println("The number is a palindrom");
				 }
				 else
				 {
					 System.out.println("The number is not a palindrom");
				 }*/
				 
			//6.find whether the given num is a prime number
/*			if (n>0)
			{
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
					{
						count++;
					}
						
				 }
				if(count==2)
				{
					System.out.println("Its a prime number");
				}
				else
				{
					System.out.println("Its NOT a prime number");
				}
			}
			else
					{
						System.out.println("Its NOT a prime number");
					}	
									
			}*/
		//7.swap 2 numbers using third variable
		/*
		 * int temp = a; a =b; b =a;
		 * System.out.println(" the new values of a and b are"+a+" and "+b);
		 */
		//8.swap 2 numbers using + and - operators
		/*
		 * a=a+b; b=a-b; a=a-b;
		 * System.out.println(" the new values of a and b are"+a+" and "+b);
		 */
		//9.swap 2 numbers using * and / operators
		/*
		 * a=a*b; b=a/b; a=a/b;
		 * System.out.println(" the new values of a and b are"+a+" and "+b);
		 */
	  //10.swap 2 numbers using one single statement
		/*
		 * b=a+b-(a=b);
		 * System.out.println(" the new values of a and b are"+a+" and "+b);
		 */
		//11.swap 2 numbers using XOR operators
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(" the new values of a and b are"+a+" and "+b);
	}	
}