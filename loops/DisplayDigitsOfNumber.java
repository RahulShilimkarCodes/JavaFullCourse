package loops;

import java.util.Scanner;

public class DisplayDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int digit,count=0;
		while(number> 0)
		{
			digit = number%10;
			number=number/10;
			count++;
			System.out.println(digit);
					
		}
		System.out.println("Number of digits in number "+number+"are :- "+count);
		sc.close();
	}

}
