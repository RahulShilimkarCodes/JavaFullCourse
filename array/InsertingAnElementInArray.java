package array;

import java.util.Scanner;

public class InsertingAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//To insert in an array you should have some free/empty spaces left..
		
		int[] numberValues = new int[7];
	  
		numberValues[0]=10;
		numberValues[1]=20;
		numberValues[2]=30;
		numberValues[3]=40;
		numberValues[4]=50;
		
		//50 spaces, but only 5 are taken, 45 are empty..
		
		System.out.println("Enter the position you want to insert element");
		
		Scanner sc = new Scanner(System.in);
		
		int insertValue = sc.nextInt();
		
		if(insertValue < numberValues.length-1)
		{
			for(int i = numberValues.length-1;i>insertValue;i--)
			{
				numberValues[i]=numberValues[i-1];
			}
			
			numberValues[insertValue]=100;
			
			for(int x : numberValues)
			{
				System.out.print(x+" ");
			}
		}
		else
		{
			System.out.println("Enter value in range please");
		}
		
		
		
		
		
		
		sc.close();

	}

}
