package logicalAndConditionalOperators;

import java.util.Scanner;

public class TypeOfWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.com - commercial
		//.gov - government website
		//.org - organisation website
		//.net - network website
		//.biz - business website
		
		// http protocol
		//ftp protocol
		//https protocol
		
		String url;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the url of the website");
		url=sc.nextLine();
		
		int protocalValue = url.indexOf(':');
		
		String protocol = url.substring(0, protocalValue);
		System.out.println("Protocol text is :- "+protocol);
		
		if(protocol.equals("http"))
		{
			System.out.println("Hypertext Transfer Protocol");
		}
		else if(protocol.equals("https"))
		{
			System.out.println("Hypertext Transfer Protocol Secured");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		else 
		{
			System.out.println("Out of knowledge");
		}
		
		int typeIndex = url.lastIndexOf('.');
		String typeOfWebsite = url.substring(typeIndex+1,url.length());
		System.out.println("Website text is :- "+typeOfWebsite);
		
		if(typeOfWebsite.equals("com"))
			System.out.println("Commercial Website");
		else if(typeOfWebsite.equals("org"))
			System.out.println("Organizational Website");
		else if(typeOfWebsite.equals("net"))
			System.out.println("Network Website");
		else if(typeOfWebsite.equals("gov"))
			System.out.println("Government Website");
		else
			System.out.println("Out of scope Website");
		
		
		sc.close();

	}

}
