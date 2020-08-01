//4) Display numbers from 3 to 30 except number 24  using while loop.

class Except
{
	public static void main(String [] args)
	{
		for(int i=3;i<31;i++)
		{
			if(!(i==24))
			{
				System.out.println(i);
			}
		}
	}
}