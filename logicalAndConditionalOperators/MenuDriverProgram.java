package logicalAndConditionalOperators;

import java.util.Scanner;

public class MenuDriverProgram {
	
	public static void main(String[] args)
	{
		int num1 , num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Enter the action you want to perform");
		sc.nextLine(); //to null out buffer...enter key is taken by this line..
		
		String action = sc.nextLine();
		action = action.toUpperCase();   //since it is case sensitive..
		
		switch(action)
		{
		case "ADDITION" : System.out.println("addition done :- "+(num1+num2));
		break;
		case "SUBTRACTION" : System.out.println("subtraction done :- "+(num1-num2));
		break;
		case "MULTIPLY" : System.out.println("addition done :- "+(num1*num2));
		break;
		case "DIVISION" : System.out.println("addition done :- "+(num1/num2));
		break;
		default : System.out.println("give correct operation");
		break;
		}
		
	}

}
