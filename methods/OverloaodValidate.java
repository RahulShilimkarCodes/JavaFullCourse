package methods;

import java.util.Scanner;

public class OverloaodValidate {
	
	public static void validate(String name)
	{
		if(name.length() < 3)
		{
			System.out.println("Enter correct name..should be more than 3 char");
		}
		else if(name.length() > 15)
		{
			System.out.println("Enter correct name..should be less than 15 char");
		}
		else
		{
			System.out.println("Name stored successfully");
		}
	}
	
	public static void validate(int age)
	{
		if(age < 18)
		{
			System.out.println("Sorry,you are less than 18 years...");
		}
		else if(age > 65)
		{
			System.out.println("Sorry,you are older than 65 years...");
		}
		else
		{
			System.out.println("Age stored successfully");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		validate(name);
		
		validate(age);
		
		sc.close();

	}

}
