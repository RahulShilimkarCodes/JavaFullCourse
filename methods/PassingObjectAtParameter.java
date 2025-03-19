package methods;

import java.util.Scanner;

public class PassingObjectAtParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which value you want to change and what is the updatedValue? ");
		
		int position = sc.nextInt();
		int value = sc.nextInt();
		
		System.out.println("Original Array is :- ");
		displayArray(myArray);
		
		updateArray(myArray,position,value);   //this will pass the reference/address of array to method parameter..
		System.out.println();
		
		System.out.println("Updated Array is :- ");
		displayArray(myArray);
		
		sc.close();

	}
	
	public static void updateArray(int array[], int index, int updatedValue)
	{
		array[index]=updatedValue;
	}
	
	public static void displayArray(int array[])
	{
		for(int x : array)
		{
			System.out.print(x+" ");
		}
	}

}
