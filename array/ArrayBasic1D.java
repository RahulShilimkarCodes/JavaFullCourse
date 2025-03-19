package array;

public class ArrayBasic1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration of an array
		
		int[] numbers = new int[5];
		//int numbers[] = new int[5];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		//declaring and initializing of an array
		
		int[] assignedNumbers = {1,2,3,4,5,6,7,8,9};
		
		//declare and assign size later
		
		int[] numberPartThree;
		numberPartThree = new int[5];
		
		//Accessing an element of an Array
		assignedNumbers[2] = 15;  //change 3 to 15...
		
		//displaying all the values in array
		
		int arrayLength = assignedNumbers.length;
		
		for(int i = 0 ; i < arrayLength ; i++ )
		{
			System.out.print(assignedNumbers[i]+" ");
		}
		
		System.out.println();
		
		//Using for each loop
		
		for(int val : numberPartThree)
		{
			System.out.print(val+" ");
		}
		

	}

}
