package methods;
import java.util.Scanner;

public class PrimeNumber {
	
	public void isPrime(int number)
	{
		int counter = 0;
		for(int i = 1 ; i < number/2 ; i++)
		{
			if(number%i == 0)
			{
				counter++;
			}
		}
		
		if(counter==1)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
	}
	
	public static void main(String[] args)
	{
		PrimeNumber pm = new PrimeNumber();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :- ");
		int enteredNumber = sc.nextInt();
		
		pm.isPrime(enteredNumber);
		
		sc.close();
		
		
	}

}
