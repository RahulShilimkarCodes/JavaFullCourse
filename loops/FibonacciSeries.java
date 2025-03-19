package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many terms are needed ?");
		
		Scanner sc = new Scanner(System.in);
		
		int totalNumber = sc.nextInt();
		int num1=0,num2=1;
		System.out.print(num1+" "+num2+" ");
		
		int result;
		
		for(int i = 1; i <= totalNumber-2 ; i++)
		{
			result=num1+num2;
			System.out.print(result+" ");
			num1=num2;
			num2=result;  

		}

		
		sc.close();
	}

}
