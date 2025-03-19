package array;

import java.util.Scanner;

public class UserEnteredInputInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A = new int[2][3];
		
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

				sc.close();
	}

}
