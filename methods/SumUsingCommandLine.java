package methods;
import java.lang.*;

@SuppressWarnings("unused")
public class SumUsingCommandLine
{

public static void main(String[] args)
{

double sum = 0;
for(int i = 0 ; i < args.length ; i++)
{
sum= Double.parseDouble(args[i])+sum;
}

System.out.println("Sum is :- "+sum);
}

}