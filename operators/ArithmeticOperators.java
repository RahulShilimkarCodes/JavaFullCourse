package operators;

public class ArithmeticOperators {
	
	public static void main(String[] args)
	{
		
		int a = 14, b = 5 ;
		
		
		int c = a/b;
		int r = a%b;
		
		System.out.println("Quotient is :- "+c);
		
		System.out.println("Remainder is "+r);
		
		float f = (float)a/b;   //Type casting..left to right flow
		
		System.out.println("Quotient of float number is :- "+f);
		
		float m = 14.3f, n = 3.2f;
		float fr = m%n;
		
		System.out.println("Remainder of float is "+fr);
		
		byte ab = 10;
		short ba = 15 ;
		//byte cb = ab +ba;   This will be an error since type will be of INT only.
		int cb = ab+ba;		//Allowed since final output will be an INT type.
		System.out.println("CB is:- "+cb);
	
		float a1 = 12.5f;
		long b1 = 123l;
		int i1 = 5;
		
		// long c1 = a1 * b1;  NOT ALLOWED SINCE RESULT WILL BE OF FLOAT
		
		float c1 = a1 * b1;
		System.out.println("C1 is:- "+c1);
		
		float d1 = a1+i1;
		System.out.println("D1 is:- "+d1);
		
		float am = 12.5f;
		double bm = 5;
		
		// float cm = am * bm; NOT ALLOWED SICNE RESUL WILL BE OF DOUBLE
		
		double cm = am * bm;
		System.out.println("CM is:- "+cm);
		
		
		char ac = 40;
		int ai2 = 10;
		
		int acd = ac - ai2;
		
		System.out.println("ACD is:- "+acd);
		
		System.out.println(10+20/2);
		
		System.out.println((10+20)/2);
		
	}

}
