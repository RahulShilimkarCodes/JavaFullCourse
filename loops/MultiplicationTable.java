package loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number whose table is needed");
		
		int number = sc.nextInt();
		
		for(int i =1 ; i <= 10; i++)
		{
			int result = number*i;
			System.out.println(number +" * "+ i + " = "+result);
			
			
			//System.out.println(number +" * "+ i + " = "+(number*i));
		}

		sc.close();
	}

}
