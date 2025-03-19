package array;

public class FindingMaximumElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberValues = {3,9,7,8,12,6,15,5,4,10};
		int biggestNumber=0;
		
		for(int i = 0 ; i < numberValues.length; i++)
		{
			if(numberValues[i] > biggestNumber)
			{
				biggestNumber = numberValues[i];
			}
		}
		
		System.out.println("Largest number in an array is :- "+biggestNumber);

	}

}
