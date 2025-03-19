package operators;

import java.util.Scanner;
import java.lang.Math;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		float a , b ,c;
		double r1, r2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value's of 3 numbers");
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		r1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
		
		r2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
		
		
		System.out.println("Roots are as follows....");
		
		System.out.println("Root R1 :- "+r1);
		System.out.println("Root R2 :- "+r2);
		
		sc.close();

	}

}
