package array;

public class IncreasingSieOfAnArray {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Once an array is created,it cannot be increased in size..
		//Hence we will create another bigger size array..
		
		int[] firstArray = new int[5];
		  
		firstArray[0]=10;
		firstArray[1]=20;
		firstArray[2]=30;
		firstArray[3]=40;
		firstArray[4]=50;
		
		int[] secondArray = new int[2*firstArray.length];
		
		System.out.println("Length of first array before increase is :- "+firstArray.length);
		System.out.println("Length of second array before nulling is :- "+secondArray.length);
		
		for(int i = 0 ; i < firstArray.length ; i++)
		{
			secondArray[i] = firstArray[i];
		}
		
		firstArray = secondArray;
		secondArray = null;
		

		
		for(int x : firstArray)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		

		
		System.out.println("Length of first array after increase is :- "+firstArray.length);
		//System.out.println("Length of second array post nulling is :- "+secondArray.length);
		
	}

}
