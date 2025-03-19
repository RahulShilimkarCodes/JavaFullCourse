package methods;

import java.util.Scanner;

public class AreasUsingMethodOverload {
	
	public double area(double length, double breadth)
	{
		return length*breadth;
	}
	
	public double area(double radius)
	{
		return Math.PI*radius*radius;
	}
	
	public double area(double lowerLength, double upperLength,double height)
	{
		return 0.5*(lowerLength+upperLength)*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double l,b,r,lt,ut,ht;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values for rectangle");
		l = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println("Enter values for circle");
		r = sc.nextDouble();
		
		System.out.println("Enter values for trapezium");
		lt = sc.nextDouble();
		ut = sc.nextDouble();
		ht = sc.nextDouble();
		
		
		AreasUsingMethodOverload areaCall = new AreasUsingMethodOverload();
		
		System.out.println("Area of Rectangle is :- "+ areaCall.area(l, b));
		
		System.out.println("Area of Circle is :- "+ areaCall.area(r));
		
		System.out.println("Area of Rectangle is :- "+ areaCall.area(lt, ut, ht));

		sc.close();
	}

}
