package loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If cubes of digits of numbers are added and if we get same number then it is armstrong number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number please");
		int num = sc.nextInt();
		int originalNumber = num;
		int result=0,value=0;
		while(num > 0)
		{
			result = num%10;
			value=(int) (value + Math.pow(result, 3));
			//value = value + result*result*result;
			num=num/10;
		}
		
		System.out.println("Value is :- " + value);
		
		if(value == originalNumber)
		{
			System.out.println("Number is an armstrong number");
		}
		else
		{
			System.out.println("Number is not an armstrong number");
		}

		sc.close();
	}

}
