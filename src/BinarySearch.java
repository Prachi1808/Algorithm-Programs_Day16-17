
/**Perpose:ask the user what type element you wants,you can sort the integers,strings and doubles.
* you can search the word or integer or double in the array.if it is found show the position.
* this BinarySearch program is Generic type.
**/
import java.util.Arrays;

import com.bridgelabz.utility.SortingFunction;
import com.bridgelabz.utility.Utility;

public class BinarySearch 
{
	public static void main(String args[])
	{
		SortingFunction sf=new SortingFunction();  
		Utility u=new Utility();

		System.out.println("Enter size: ");
		int arraySize=u.inputInteger();
		int a[]=sf.input1DArray(arraySize);
		//sorting the array
		Arrays.sort(a);								
		System.out.println();
		System.out.println("The Sorted Order is: ");
		//printing the sorted array
		sf.print1DArray(a);							
		System.out.println();
		System.out.println("Enter Key: ");
		int position=sf.binarySearch(a,u.inputInteger());

		if(position==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+position+" position");
		}
	}
}