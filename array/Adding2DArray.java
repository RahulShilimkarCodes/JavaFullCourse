package array;

public class Adding2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] firstArray = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] secondArray = {{10,11,12},{13,14,15},{16,17,8}};
		int[][] thirdArray = new int[3][3];
		
		for(int i = 0; i < firstArray.length;i++)
		{
			for(int j = 0 ; j < firstArray[i].length; j++)
			{
				thirdArray[i][j]=firstArray[i][j]+secondArray[i][j];
			}
		}
		
		System.out.println("Added array is :- ");
		
		for(int x[] : thirdArray)
		{
			for(int y : x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
