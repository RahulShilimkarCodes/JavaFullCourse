package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string :- ");
		
		Scanner sc = new Scanner(System.in);
		
		String originalString = sc.nextLine();
		String reverseString = "";
		
		System.out.println("Original String is as below :- ");
		
		System.out.println(originalString);
		
		for(int i = originalString.length() - 1 ; i >= 0; i--)
		{
			reverseString = reverseString + originalString.charAt(i);
		}
		
		System.out.println("Reversed String is :- ");
		System.out.println(reverseString);

		sc.close();
	}

}
