package loops;

import java.util.Scanner;

public class PowersOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for which all powers are to be found");
		int base = sc.nextInt();
		
		System.out.println("Enter the number of times power to be found");
		int expo = sc.nextInt();
		
		int iteration = 1;
		
		while(iteration <= expo)
		{
			int number = (int) Math.pow(base, iteration);
			System.out.println("Power of "+ iteration+" is "+number);
			iteration++;
		}
		
		sc.close();

	}

}
