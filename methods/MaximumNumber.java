package methods;
import java.util.Scanner;

public class MaximumNumber {
	
	int maximumNumber(int num1, int num2)
	{
		if(num1>num2)
			return num1;
		else
			return num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber,secondNumber,maxNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :- ");
		firstNumber = sc.nextInt();
		
		System.out.println("Enter second number :- ");
		secondNumber = sc.nextInt();
		
		MaximumNumber mn = new MaximumNumber();
		maxNumber = mn.maximumNumber(firstNumber, secondNumber);
		
		System.out.println("Maximum number is :- "+maxNumber);
		
		sc.close();
		
	}

}
