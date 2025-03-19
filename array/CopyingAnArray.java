package array;

public class CopyingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
		
		int[] secondArray = new int[10];
		
		for(int i = 0 ; i < firstArray.length ; i++)
		{
			secondArray[i] = firstArray[i];
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
