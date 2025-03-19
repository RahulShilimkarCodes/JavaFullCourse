package array;

import java.util.Scanner;

public class DeletingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numberValues = new int[7];
		  
		numberValues[0]=10;
		numberValues[1]=20;
		numberValues[2]=30;
		numberValues[3]=40;
		numberValues[4]=50;
		
		//50 spaces, but only 5 are taken, 45 are empty..
		
		System.out.println("Enter the position you want to delete element");
		
		Scanner sc = new Scanner(System.in);
		
		int deleteValue = sc.nextInt();
		
		for(int i = deleteValue ; i < numberValues.length-1 ; i++)
		{
			numberValues[i]=numberValues[i+1];
		}
		
		for(int x : numberValues)
		{
			System.out.print(x+" ");
		}


		sc.close();
	}

}
