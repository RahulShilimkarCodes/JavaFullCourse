package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if reverse of a number is equal to the number, then it is palindrome...
		
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int copyNum = num;
		
		int reverse=0,rem=0;
		
		while(num>0)
		{
			rem=num%10;
			reverse=rem+reverse*10;
			num=num/10;
		}
		
		if(copyNum==reverse)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");

		}
		sc.close();

	}

}
