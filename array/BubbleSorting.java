package array;

public class BubbleSorting {
	
	public static void bubbleSort(int[] array)
	
	{
		int temp = 0;
		int length = array.length;
		
		for(int i = 0; i < length ; i++)
		{
			for(int j = 0 ; j < length-i-1 ; j++)   //j < length-i-1 -> This is because last values(i.e.(i) are already sorted)..
			{										//j < length - 1 would also work fine but will check all numbers everytime..
				if(array[j] > array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberValues = {3,9,7,8,14,6,15,5,4,100};
	
		System.out.println("Original Array:- ");
		
		for(int x : numberValues)
		{
			System.out.print(x+" ");
		}
		
		bubbleSort(numberValues);
		
		System.out.println();
		
		System.out.println("Sorted array");
		for(int x : numberValues)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		int arrayLength = numberValues.length;
		
		System.out.println("Maximum number is :- "+numberValues[arrayLength-1]);
		
		System.out.println("Second Largest number is :- "+numberValues[arrayLength-2]);
		
		System.out.println("Minimum number is :- "+numberValues[0]);

	}

}
