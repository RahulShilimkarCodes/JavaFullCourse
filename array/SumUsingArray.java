package array;

public class SumUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sum=0;
		
		float[] numberValues = {3,9,7,8,12,6,15,5,4,10};
		
		float arrayLength = numberValues.length;
		
		for(int i = 0 ; i < arrayLength ; i++)
		{
			sum = sum + numberValues[i];
		}
		System.out.println("Sum of an Array using for loop is :- "+sum);
		
		
		sum = 0;
		//using for each
		for(float x : numberValues)
		{
			sum = sum + x;
		}
		
		System.out.println("Sum of an Array using for-each loop is :- "+sum);

	}

}
