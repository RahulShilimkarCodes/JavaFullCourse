package array;

import java.util.Scanner;

public class TwoDimensionalArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A = new int[3][2];  	//2D Array of size 5 by 5.
		
		int[][] B = {{1,2,3},{5,6,7},{10,9,3}};		//2D Array of size 3 by 3..
		
		int[][] C;
		C = new int[3][3];
		
		int D[][] = new int[5][5]; 
		
		int[] E,F[];		//Note:- Here, E would be a 1D Array and F would be 2D Array.
		E = new int[5];
		F = new int[3][2];
		
		int[] G[]= new int[5][5]; 
		
		int[] H,I,J,K; 		//Note:- All this are 1D Array declared at same line...
		
		System.out.println("Enter the elements of array:- ");
		//Entering elements of the array..
				int firstLength = A.length;
				Scanner sc = new Scanner(System.in);
				
				for(int i = 0 ; i < firstLength ; i++)
				{
					for(int j = 0 ; j < A[i].length; j++)
					{
						A[i][j]=sc.nextInt();
					}
				}

				
				System.out.println("First user entered array is :- ");
				for(int x[] : A)
				{
					for(int y : x)
					{
						System.out.print(y+" ");
					}
					System.out.println();
				}
		
				
		System.out.println("Second pre entered array is :- ");
		//Printing elements of the array..
		for(int i = 0 ; i < B.length ; i++)
		{
			for(int j = 0 ; j < B[i].length ; j++)
			{
				System.out.print(B[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		sc.close();
		

	}

}
