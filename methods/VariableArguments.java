package methods;

public class VariableArguments {
	
	public static void show(int ... value)
	{
		for(int x : value)
		{
			System.out.print(x+" ");
		}
		
	}
	
	public static void showName( String ... names)
	{
//		for(String x : names)
//		{
//			System.out.println(x);
//		
		
		for(int i = 0 ; i < names.length ; i++)
		{
			System.out.println((i+1)+". "+names[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show();
		System.out.println();
		show(10,20,30);
		System.out.println();
		show(new int[] {100,200,300,400,500,600});
		System.out.println();
		
		showName("John","Ritik","SRK","Salman");

	}

}
