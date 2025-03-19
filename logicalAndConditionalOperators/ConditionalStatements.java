package logicalAndConditionalOperators;

import java.util.Scanner;

public class ConditionalStatements {
	
	public static void maximumNumber(int a , int b, int c)
	{
		if((a>b)&&(a>c))
		{
			System.out.println("Biggest number is :- "+a);
		}
		else if (b>c)
		{
			System.out.println("Biggest number is :- "+b);
		}
		else
		{
			System.out.println("Biggest number is :- "+c);
		}
	}
	
	public static void minimumNumber(int a , int b, int c)
	{
		if((a<b)&&(a<c))
		{
			System.out.println("Smaller number is :- "+a);
		}
		else if (b<c)
		{
			System.out.println("Smaller number is :- "+b);
		}
		else
		{
			System.out.println("Smaller number is :- "+c);
		}
	}
	
	public double averageOfNumber(int a , int b, int c)
	{
		double result = (a+b+c)/3f;
		return result;
	}
	
	public static void main(String[] args)
	{
		
		int num1,num2,num3;
		System.out.println("Give 3 numbers");
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		maximumNumber(num1,num2,num3);
		
		minimumNumber(num1,num2,num3);
		
		ConditionalStatements cs = new ConditionalStatements();
		double average = cs.averageOfNumber(num1, num2, num3);
		
		System.out.println("Average of 3 number is :- "+average);
		
		sc.close();
		
	}

}
