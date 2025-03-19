package methods;

import java.util.Scanner;

public class MethodOverloading {
	
	public int maximum(int a , int b)
	{
		return (a>b)?a:b;
	}
	
	public float maximum(float a , float b)
	{
		return (a>b)?a:b;
	}
	
	public int maximum(int a , int b,int c)
	{
		return (a>b && a>c)?a:((b>c)?b:c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 integer numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("Enter 2 float numbers");
		float num4 = sc.nextFloat();
		float num5 = sc.nextFloat();
		
		MethodOverloading mo = new MethodOverloading();
		
		System.out.println("Maximum of 2 integer number "+num1+"and "+num2+" is :- "+mo.maximum(num1, num2));
		
		System.out.println("Maximum of 2 float number "+num4+"and "+num5+" is :-  "+mo.maximum(num4, num5));
		
		System.out.println("Maximum of 3 integer numer "+num1+" "+num2+" and "+num3+" is :- "+mo.maximum(num1, num2, num3));
		

		sc.close();
		
	}

}
