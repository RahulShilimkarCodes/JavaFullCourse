package methods;

public class MethodsUsingVarargs {
	
	public static void maximum(int ... number) //int ... number -> will be taking in form of array only always
	{
		int maximum=0;
		
		if(number.length == 0)
		{
			System.out.println("No number entered");
		}
		else
		{
			for(int i = 0 ; i < number.length ; i++)
			{
				if(number[i] > maximum)
				{
					maximum = number[i];
				}
			}
			System.out.println("Maximum number is :- "+maximum);
		}
	}
	
	
	public static int sum(int number,int ... num)
	{
		int sum=0;
		sum = sum+number;
		
		for(int i = 0 ; i < num.length; i++)
		{
			sum=sum+num[i];
		}
		
		return sum;
	}
	
	
	public static double discount(double prices[])
	{
		double total = sum(prices);
		double discountValue;
		
		if(total <= 500)
		{
			discountValue = (total* 10)/100;
		}
		else if(total > 500 && total < 3000)
		{
			discountValue = (total* 20)/100;
		}
		else
		{
			discountValue = (total * 30)/100;
		}
		
		return discountValue;
	}

	public static double sum(double[] prices) {
		
		double total = 0;
		
		for(int i = 0 ; i < prices.length ; i++)
		{
			total = total+prices[i];
		}
		
		return total;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		maximum(1,2,333,465,5,6556,7,8,0);

		maximum();
		
		System.out.println("Sum is :- "+sum(10,20,40,50));
		
		System.out.println("Sum is :- "+sum(2));
		
		System.out.println("Sum is :- "+sum(100,1000,20003,00230));
		
		
		System.out.println(discount(new double[] {100,200}));
		
		System.out.println(discount(new double[] {1000,1000}));
		
		System.out.println(discount(new double[] {1000,2000,3000}));
		

	}

}
