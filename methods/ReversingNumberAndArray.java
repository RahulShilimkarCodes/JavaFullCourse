package methods;

public class ReversingNumberAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array =  {1,2,3,45,99,100,232,234,234,222};
		
		System.out.println("Normal reversing a number :- "+reverse(20000));
		System.out.println("String reversing a number :- "+reverseUsingString(20000));

		System.out.println("Array reversing :- ");
		reverse(array);
	}
	
	public static int reverse(int num)
	{
		int rev=0,rem=0;
		while(num > 0)
		{
			rem = num%10;
			rev = rem + rev*10;
			num = num/10;
		}
		
		return rev;
	}
	
	public static String reverseUsingString(int num)
	{
		int rem=0;
		String reverseString="";
		while(num > 0)
		{
			rem = num%10;
			reverseString = reverseString+rem;
			num = num/10;
		}
		
		return reverseString;
	}
	
	public static void reverse(int myArray[])
	{
		int[] reversedArray = new int[myArray.length];
		
		for(int i = myArray.length - 1 , j = 0 ; i >= 0 ; i-- , j++)
		{
			reversedArray[j] = myArray[i];
		}
		
		for(int x : reversedArray)
		{
			System.out.print(x+" ");
		}
	}
	


}
