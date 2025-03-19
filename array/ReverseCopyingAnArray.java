package array;

public class ReverseCopyingAnArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
		
		int[] secondArray = new int[10];
		
		int firstLength = firstArray.length;
		int secondLength = secondArray.length;
		
//		for(int i = 0 ; i < firstArray.length ; i++)
//		{
//			secondArray[secondLength-1-i] = firstArray[i];
//		}
		
		//Logic-2
		
		for(int i = firstLength-1, j=0 ; i >= 0 ; i--,j++)
		{
			secondArray[j] = firstArray[i];
		}
		
		
		System.out.println("Orginial Array is :- ");
		for(int x : firstArray)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		System.out.println("Copied Array is :- ");
		for(int x : secondArray)
		{
			System.out.print(x+" ");
		}

	}

}
