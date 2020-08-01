
public class Calculator 
{
	int calDouble(int number) throws ArithmeticException
	{
		if(number>0)
		{
			number = 2 * number;
			return number;
		}
		else if(number<0) throw new ArithmeticException("negative not allowed");
		
			
		else throw new ArithmeticException("Zero not allowed");
		
	}
}
