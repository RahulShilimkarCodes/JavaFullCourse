package methods;

public class GCDFor2Numbers {
	
	public int greatestCommonDivisor(int num1, int num2)
	{
		while(num1!=num2)
		{
			if(num1>num2)
			{
				num1 = num1-num2;
			}
			else
			{
				num2 = num2-num1;
			}
		}
		
		return num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GCDFor2Numbers gcd = new GCDFor2Numbers();
		
		int greatestdivisor = gcd.greatestCommonDivisor(35, 56);
		
		System.out.println("Greatest common divisor is :- "+greatestdivisor);

	}

}
