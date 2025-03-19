package logicalAndConditionalOperators;

import java.util.Scanner;

public class YoungOrOld {
	
	public static void main(String args[])
	{
		System.out.println("enter the age of person");
		
		//Young till 60 years, kid till 14 years..
		
		Scanner sc = new Scanner(System.in);
		
		double age = sc.nextDouble();
		
		if(age<14)
		{
			System.out.println("Person is a kid");
		}
		else if (age >= 14 && age <= 60)
		{
			System.out.println("Person is a young one");
		}
		else
		{
			System.out.println("Person is a old one");
		}
		
		sc.close();
	}

}
