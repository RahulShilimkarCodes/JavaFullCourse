package array;

import java.util.Scanner;

public class SearchingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberValues = {3,9,7,8,12,6,15,5,4,10};
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be searched :-");
		num = sc.nextInt();
		
		//searching for element/number 6..
		
		for(int i = 0 ; i < numberValues.length ; i++)
		{
			if(numberValues[i]==num)
			{
				System.out.println("Element is present at "+i+"th position");
				System.exit(0);
			}
			
		}
		System.out.println("value not found in the array");
		sc.close();

	}
}
