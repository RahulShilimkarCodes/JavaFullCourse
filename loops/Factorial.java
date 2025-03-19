package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  5! = 1*2*3*4*5;
		
		System.out.println("Enter the number of which factorial is needed");
		
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int number = sc.nextInt();
		
		for(int i = 1 ; i <= number ; i++)
		{
			 result = result*i;
		}
		
		System.out.println("Factorial of "+ number + " is :- "+result);
		

		sc.close();
	}

}
