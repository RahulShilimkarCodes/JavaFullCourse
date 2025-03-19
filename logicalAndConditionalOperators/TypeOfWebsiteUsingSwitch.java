package logicalAndConditionalOperators;

import java.util.Scanner;

public class TypeOfWebsiteUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the url");
		
		url = sc.nextLine();
		
		int lastIndexValue = url.lastIndexOf('.');
		
		String domainName = url.substring(lastIndexValue+1,url.length());
		
		switch(domainName)
		
		{
		case "com" : System.out.println("Website type is commercial");
		break;
		
		case "org" : System.out.println("Website type is organizational");
		break;
		
		case "net" : System.out.println("Website type is networkal");
		break;
		
		case "gov" : System.out.println("Website type is governmental");
		break;
		
		default: System.out.println("Website type is other");
		break;
		}
		
		sc.close();

	}

}
