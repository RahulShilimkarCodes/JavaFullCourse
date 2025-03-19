package logicalAndConditionalOperators;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number should be divisible by 4 also should be divisibly by 400 in case of number like (1900,1800,2000,etc.)
		
		int year;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year");
		
		year=sc.nextInt();
		
		if(year%4 == 0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
				{
					System.out.println(year+" is a leap year");
				}
				else
				{
					System.out.println(year+" is not a leap year");
				}
			}
			else
			{
				System.out.println(year+" is a leap year");
			}
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
		
		sc.close();

	}

}
