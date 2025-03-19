package operators;

public class BitwiseOperators {
	
	public static void main(String[] args)
	{
		int x = 10, y = 6 , z;
		
		z = x & y;
		System.out.println(z);
		
		z = x | y;
		System.out.println(z);
		
		z = x ^ y;
		System.out.println(z);
		
		z = x>>1;	//makes number half since divide by 2^k.
		System.out.println(z);
		
		z = x<<1;	//makes number double since multiply by 2^k.
		System.out.println(z);
		
		z = x<<3;	//makes numbeer as 80 since multiply by 2^3.
		System.out.println(z);
		
	}

}
