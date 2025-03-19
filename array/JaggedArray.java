package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] jaggedArray;
		jaggedArray = new int[3][];
		
		jaggedArray[0]=new int[2];
		jaggedArray[1]=new int[4];
		jaggedArray[2]=new int[3];
		
		
		//Entering elements inside jagged array...
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter values in the array :- ");
		for(int i = 0 ; i < jaggedArray.length; i++)
		{
			for(int j = 0 ; j < jaggedArray[i].length ; j++)
			{
				jaggedArray[i][j]=sc.nextInt();
			}
		}
		
		//Printing jagged array..
		System.out.println("Printing the array values now :- ");
		for(int x[] : jaggedArray)
		{
			for(int y : x)
			{
				System.out.print(y+" ");
			}
			
			System.out.println();
		}
		
		

		sc.close();
	}

}
