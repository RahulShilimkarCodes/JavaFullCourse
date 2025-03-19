package logicalAndConditionalOperators;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddAndEven eo = new OddAndEven();
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		
		eo.checkEvenOrAdd(num);
	
		sc.close();
	}
	
	public void checkEvenOrAdd(int number)
	{
		int result = number%2;
		
		if(result==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
	}

}
