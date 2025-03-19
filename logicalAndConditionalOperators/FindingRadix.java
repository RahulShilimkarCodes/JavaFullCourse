package logicalAndConditionalOperators;

import java.util.Scanner;

public class FindingRadix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		String radixString = sc.nextLine();
		
		if(radixString.matches("[01]+"))
			System.out.println("Binary Radix");
		else if (radixString.matches("[0-7]+"))
			System.out.println("Octal Radix");
		else if (radixString.matches("[0-9]+"))
			System.out.println("Decimal Radix");
		else if (radixString.matches("[0-9A-F]+"))
			System.out.println("Hexadecimal Radix");
		else
			System.out.println("Invalid String");

		sc.close();
	}

}
