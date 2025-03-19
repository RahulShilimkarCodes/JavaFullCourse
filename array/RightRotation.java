package array;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberValues = {3,9,7,8,14,6,15,5,4,10};
		
		System.out.println("Original array is as below:- ");
		
		for(int x : numberValues)
		{
			System.out.print(x+" ");
		}
		
		int length = numberValues.length;
		
		int temp = numberValues[length-1];
		
		
		for(int i = numberValues.length-1 ; i > 0 ; i -- )
		{
			numberValues[i]=numberValues[i-1];
		}
		
		numberValues[0]=temp;
		
		System.out.println();
		
		System.out.println("Right rotated array is as below:-");
		
		for(int x : numberValues)
		{
			System.out.print(x+" ");
		}
	}

}
