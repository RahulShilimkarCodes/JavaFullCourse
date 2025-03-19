package operators;

import java.util.Scanner;

public class TraingleAreaUsingSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		float s,area;
		
		// sum = (1f/2f)*(a+b+c)
		// area = square_root(s(s-a)(s-b)(s-c))
		
		System.out.println("Enter values for a , b and c sides");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		  
		s = (float) (0.5)*(a+b+c);
		
		//s = (1f/2f)*(a+b+c);
		
		area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of triangle is :- "+area);
		
		sc.close();
		

	}

}
