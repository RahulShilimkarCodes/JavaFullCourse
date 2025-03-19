package basicsOfJavaPrograms;


import java.lang.Math;

public class MathClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.abs(-10));  // Absolute value: 10
		
		System.out.println(Math.max(10, 20));  // Maximum: 20
		System.out.println(Math.max(10, Math.max(20, 50))); //10,50 -> 50
		
		System.out.println(Math.min(10, 20));  // Minimum: 10
		System.out.println(Math.min(Math.min(10, 20),Math.min(50, 02)));	//10,02 -> 02
		
		System.out.println(Math.pow(2, 3));  // Power: 2^3 = 8.0
		System.out.println(Math.pow(4, 2));  //4^2 = 16.0
		
		System.out.println(Math.sqrt(25));  // Square root: 5.0
		System.out.println(Math.cbrt(27));  // Cube root: 3.0
		
		
		System.out.println(Math.signum(-5));  // Sign function: -1.0
		
		System.out.println(Math.ceil(4.3));  // Round up: 5.0
		System.out.println(Math.floor(4.7));  // Round down: 4.0
		System.out.println(Math.round(4.5));  // Round to nearest: 5
		System.out.println(Math.round(4.4));  // Round to nearest: 4
		
		double randomValue = Math.random(); // Random value between 0.0 and 1.0 (exclusive)
		System.out.println(randomValue);
		
		int a = 10, b = 20;
		
		System.out.println("Addition is :- "+ Math.addExact(a, b));
		System.out.println("Subtraction is :- "+ Math.subtractExact(a, b));
		System.out.println("Multiplication is :- "+ Math.multiplyExact(a, b));
		
		System.out.println(Math.PI);  // 3.141592653589793
		System.out.println(Math.E);  // 2.718281828459045

		
		



		


	}

}
