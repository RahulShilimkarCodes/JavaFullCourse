package loops;

import java.util.Scanner;

public class GeometricProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startNum, difference, totalNumbers, resultList;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting number :- ");
		startNum = sc.nextInt();
		
		System.out.println("Enter difference number :- ");
		difference = sc.nextInt();
		
		System.out.println("Enter total number  needed :- ");
		totalNumbers = sc.nextInt();
		
		resultList = startNum;
		
		for(int i = 1; i <= totalNumbers ; i++)
		{
			System.out.print(resultList + " ");
			//resultList = (int) (startNum*Math.pow(difference, i));
			resultList = resultList*difference;
		}
		
		sc.close();

	}

}
