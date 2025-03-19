package operators;
import java.lang.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class CalculateAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float base, height, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base ");
		base = sc.nextFloat();
		
		
		System.out.println("Enter height ");
		height = sc.nextFloat();
		
		System.out.println("Entered value's are base - "+base+" and height - "+height);
		 
		//area = (float) 0.5*base*height;
		
		area =  0.5F*base*height;
		
		
		System.out.println("Area of an triangle is :- "+area);
		
		sc.close();


	}

}
