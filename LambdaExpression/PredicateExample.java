package LambdaExpression;
import java.util.function.*;

public class PredicateExample
{
	public static void main(String[] args) 
	{
		Predicate<Integer> P1 = i -> i%2==0;
		System.out.println(P1.test(10));
		System.out.println(P1.test(15));
	}
}