package array;

public class RotatingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberValues = {3,9,7,8,14,6,15,5,4,10};
		
		System.out.println("Original array is as below:- ");
		
		for(int x : numberValues)
		{
			System.out.print(x+" ");
		}
		
		int temp = numberValues[0];
		
		for(int i = 0 ; i < numberValues.length-1 ; i++)
		{
			numberValues[i]=numberValues[i+1];
		}
		
		numberValues[numberValues.length-1] = temp;
		
		System.out.println();
		
		
		System.out.println("Left rotation array is as below:- ");
		
		for(int a : numberValues)
		{
			System.out.print(a+" ");
		}
		

	}

}
