package operators;

public class IncrementAndDecrementOperators {
	
	public static void main(String[] args)
	{
		
		int x = 5,y;
		x++;
		System.out.println(x);
		
		x = 5;
		++x;
		System.out.println(x);
		
		
		System.out.println("Post Increment");
		x=5;
		y=x++;   //Assignment is done first and then it is incremented..Left to Right flow of execution
		System.out.println("X is :- "+x);
		System.out.println("Y is :- "+y);
		
		
		System.out.println("Pre Increment");
		x=5;
		y=++x;	//Increment is done first and then it is incremented..Left to Right flow of execution
		System.out.println("X is :- "+x);
		System.out.println("Y is :- "+y);
		
		
		System.out.println("Post equation");
		x=5;y=4;
		int c = 2*x++ + 3*y++;
		System.out.println("C is :- "+c);
		System.out.println("X is :- "+x);
		System.out.println("Y is :- "+y);
		
		System.out.println("Pre equation");
		x=5;y=4;
		c = 2*++x + 3*++y;
		System.out.println("C is :- "+c);
		System.out.println("X is :- "+x);
		System.out.println("Y is :- "+y);
		
		System.out.println("Mixing both Post and Pre equation");
		x=5;y=4;
		c = 2*++x + 3*y++;
		System.out.println("C is :- "+c);
		System.out.println("X is :- "+x);
		System.out.println("Y is :- "+y);
		
		System.out.println("Mixing both Post and Pre equation for one variable");
		x=5;
		c = 2*x++ + 3*++x;
		System.out.println("C is :- "+c);
		System.out.println("X is :- "+x);
		
		
		System.out.println("Using on float Post");
		float a = 3.12f;
		a++;
		System.out.println("Float value of A is :- "+a);
		
		
		System.out.println("Using on float Pre");
		float b = 3.12f;
		++b;
		System.out.println("Float value of B is :- "+b);
		
		System.out.println("Using on Char Pre");
		char character = 'B';
		++character;
		System.out.println("Char value of character is :- "+character);
		
		System.out.println("Using on Char Post");
		character = 'B';
		character++;
		System.out.println("Char value of character is :- "+character);
		
		
		character = 'B';
		System.out.println("PRE Char value of character is :- "+ ++character);
		System.out.println("POST Char value of character is :- "+ character++);
		System.out.println("POST POST Char value of character is :- "+ character);

		
	}

}
