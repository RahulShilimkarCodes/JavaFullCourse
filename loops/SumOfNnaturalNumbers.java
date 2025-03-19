package loops;

import java.util.Scanner;

public class SumOfNnaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number range till where sum is needed");
		int result=0;
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= number ; i++)
		{
			result = result+i;		
		}
		
		System.out.println("Sum of first "+ number +" natural number is :- "+result);

		sc.close();
	}

}
