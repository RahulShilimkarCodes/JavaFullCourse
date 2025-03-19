package loops;

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// common difference between numbers..
		
		int startNum, difference, totalNumbers, resultList=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting number :- ");
		startNum = sc.nextInt();
		
		System.out.println("Enter difference number :- ");
		difference = sc.nextInt();
		
		System.out.println("Enter total number  needed :- ");
		totalNumbers = sc.nextInt();
		
		int i = 1;
		
		System.out.print(startNum+" ");
		resultList = startNum;
		
		for(i = 1; i < totalNumbers ; i++)
		{
			resultList = resultList + difference;
			System.out.print(resultList+" ");	
			
		}
		
		sc.close();
		

	}

}
