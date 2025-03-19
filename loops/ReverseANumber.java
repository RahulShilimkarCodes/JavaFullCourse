package loops;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		//int copyNum = num;
		int result = 0,value=0;
		
		while(num>0)
		{
			result=num%10;
			value=result+value*10;
			num=num/10;
		}
		
		System.out.println(value);
		

		sc.close();
	}

}
