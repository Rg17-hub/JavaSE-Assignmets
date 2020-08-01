//4)	Display numbers from 3 to 30 except number 24  using while loop.

public class Except
{
	public static void main(String []args)
	{
		int number =3;
		while(number<30)
		{
			
			if(number!=24)
			System.out.println(number);
			
			number++;
		}
	}
}