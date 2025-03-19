package loops;

import java.util.Scanner;

public class PrintingDigitsInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rem=0;
		String revString="";
		
		while(num>0)
		{
			rem=num%10;
			revString=revString+rem;
			num=num/10;
		}
		
		System.out.println("Reversed number in String format is :- "+revString);
		
		//Reversing the string to get original string
		String originalStringFetch="";
		
		for(int i = revString.length()-1;i>=0;i--)
		{
			originalStringFetch=originalStringFetch+revString.charAt(i);
		}
		
		System.out.println("Original number in String format is :- "+originalStringFetch);
		
		char originalStringFetchTwo;
		for(int i = revString.length()-1;i>=0;i--)
		{
			originalStringFetchTwo=revString.charAt(i);
			switch(originalStringFetchTwo)
			{
			
			case '0':System.out.print("Zero ");
			break;
			
			case '1':System.out.print("One ");
			break;
			
			case '2':System.out.print("Two ");
			break;
			
			case '3':System.out.print("Three ");
			break;
			
			case '4':System.out.print("Four ");
			break;
			
			case '5':System.out.print("Five ");
			break;
			
			case '6':System.out.print("Six ");
			break;
			
			case '7':System.out.print("Seven ");
			break;
			
			case '8':System.out.print("Eight ");
			break;
			
			case '9':System.out.print("Nine ");
			break;
			}
		}
		sc.close();

	}

}
