package operators;

import java.util.Scanner;

public class Cuboid {
	
	public static int AreaCalculation(int a, int b)
	{
		int result = a * b;
		return result;
	}
	
	public int volumeCalculation (int a , int b , int c)
	{
		int volume = a * b * c;
		return volume;
	}
	
	public int perimeterCalculation (int a , int b , int c)
	{
		int perimeter = 2*a+b+c;
		return perimeter;
	}
	
	public int totalArea (int a , int b , int c)
	{
		int area = 2*(a*b+b*c+c*a);
		return area;
	}
//	public int frontAreaCalculation(int a, int b)
//	{
//		int result = a * b;
//		return result;
//	}
//	
//	public int topAreaCalculation(int a, int b)
//	{
//		int result = a * b;
//		return result;
//	}
//	
//	public int sideAreaCalculation(int a, int b)
//	{
//		int result = a * b;
//		return result;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length, height, breadth;
		int volume, perimeter,totalArea, front_area,side_area,bottom_area;
		
		System.out.println("Enter length, height and breadth of a cuboid");
		
		Scanner sc = new Scanner(System.in);
		
		length = sc.nextInt();
		breadth = sc.nextInt();
		height = sc.nextInt();
		
// Note:- 	If i don't declare method as static, i have to create an object of the class like below to use method	
//		Cuboid cd = new Cuboid();
//		front_area = cd.AreaCalculation(length, height);
		
		front_area = AreaCalculation(length,height);
		System.out.println("Front area is :- "+front_area);
		
		side_area = AreaCalculation(breadth,height);
		System.out.println("Side area is :- "+side_area);
		
		bottom_area = AreaCalculation(breadth,length);
		System.out.println("Bottom area is :- "+bottom_area);
		
		//Using below since volumeCalculation method is not static...
		Cuboid cd = new Cuboid();
		volume = cd.volumeCalculation(length, height, breadth);
		System.out.println("Volume is :- "+volume);
		
		perimeter = cd.perimeterCalculation(length, height, breadth);
		System.out.println("Perimeter is :- "+perimeter);
		
		totalArea = cd.totalArea(length, height, breadth);
		System.out.println("TotalArea is :- "+totalArea);
		
		
		sc.close();

	}

}
