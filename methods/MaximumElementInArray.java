package methods;

public class MaximumElementInArray {
	
	public void sortArrayElement(int[] array)
	{
		int temp;
		for(int i = 0 ; i < array.length ; i++)
		{
			for(int j = 0 ; j < array.length-1-i ; j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}
	
	public int maximumArrayElement(int[] array)
	{
		sortArrayElement(array);
		
		return array[array.length-1];
	}
	
	public void sortedArray(int[] array)
	{
		sortArrayElement(array);
		System.out.println("Sorted array is :- ");
		for(int x : array)
		{
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {1,58,132,91,59,63,7,52,20};
		
		MaximumElementInArray mx = new MaximumElementInArray();
		
		int largestNumber = mx.maximumArrayElement(myArray);
		
		System.out.println("Largest Element in an Array is :- "+largestNumber);
		
		mx.sortedArray(myArray);
		
		

	}

}
