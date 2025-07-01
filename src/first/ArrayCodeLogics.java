package first;

import java.util.HashSet;

public class ArrayCodeLogics {
	// 1a.to read all the elements in normal for loop
	// 1b.to read all the elements in enhanced for loop
	// 2. to find length of the rows
	// 3. to find length of the cols
	// 4.to find the sum of elements in an array
	// 5.print even and odd elements in an array
	// 6.Search an element in an array
	// 7.how to find duplicates in an array
	// 8.string reverse
	// 9.Find the missing number in an array
	// 9. Find largest number in an array
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 3 };
		String arr[] = { "Java", "c", "Python", "C++", "Java" };
		int sum = 0;
		String s = "cat";
		int even = 0;
		int odd = 0;
		int searchElement = 5;
		int rep = 5;
		int count = 0;
		int duptemp = 0;
		boolean status = false;
		boolean flagDup = false;
		
		 //1a.to read all the rows in normal for loop 
		 //for(int i=0;i<=a.length;i++)==>Index 5 out of bounds for length 5 
		 for(int i=0;i<=a.length;i++)
		 {
		 System.out.println(i+"no element in the array "+a[i]); 
		 } 
		 
		 //1b.to read all the elements in enhanced for loop 
		 for(int i:a) 
		 {
		 System.out.println("The element in the array "+ i); 
		 }
		 
		/* //2. to find length of the rows
		 * System.out.println(" the row length is "+a.length);
		 * 
		 * 
		 * //4.to find the sum of elements in an array for(int i:a) { sum=sum+i; }
		 * System.out.println(" the sum of the elements is "+sum); //5.print even and
		 * odd elements in an array for(int i:a) { if(i%2==0) { even++; } else { odd++;
		 * } } System.out.println(" the count of even and odd are "+even+" and "+odd);
		 * //6.Search an element in an array for(int i:a) { if(i==searchElement) {
		 * status = true; break; } else block should not be there, because we need to
		 * check all the elements else { System.out.println("the element NOT found"); }
		 * 
		 * } if(status==false) { System.out.println("The element is Not found"); } else
		 * { System.out.println("The element is found"); } //7.how to find duplicates in
		 * an array
		 */ // Approach 1= take all the element one by one and compare with rest
		/*
		 * for (int i = 0; i < a.length; i++)// length=7 { for (int j = i + 1; j <
		 * a.length; j++) { if (a[i] == a[j]) { //duptemp =a[i]; try to code how many
		 * times duplicate is repeated
		 * System.out.println("The duplicate element "+a[i]+"is found"); flagDup = true;
		 * } } } if (flagDup == false) {
		 * System.out.println("The duplicate element is not found"); }
		 */
		// Approach 2 - Hashset collections
		// Adding all the elements of given array to Hashset variable array, which
		// doesnt allow duplicates
		/*
		 * HashSet<String> langs = new HashSet(); //if we add any duplicate element, it
		 * will display false
		 * 
		 * System.out.println(langs.add(1)); System.out.println(langs.add(2));
		 * System.out.println(langs.add(1));
		 * 
		 * for(var i:arr) { if(langs.add(i)==false) {
		 * System.out.println("Found Duplicate Element: "+i); flagDup=true; } } if
		 * (flagDup == false) {
		 * System.out.println("The duplicate element is not found"); }
		 */

		// 8.string reverse
			//String temp = s.charAt(duptemp)
	}

}
