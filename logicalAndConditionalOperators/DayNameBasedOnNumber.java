package logicalAndConditionalOperators;

import java.util.Scanner;

public class DayNameBasedOnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day value");
		day = sc.nextInt();
		
		if(day==1)
			System.out.println("Day is Monday");
		else if(day==2)
			System.out.println("Day is Tuesday");
		else if(day==3)
			System.out.println("Day is Wednesday");
		else if(day==4)
			System.out.println("Day is Thursday");
		else if(day==5)
			System.out.println("Day is Friday");
		else if(day==6)
			System.out.println("Day is Saturday");
		else if(day==7)
			System.out.println("Day is Sunday");
		else
			System.out.println("Day is not a valid day");
		
		sc.close();

	}

}
