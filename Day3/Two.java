
class First
{
	int i;
	First(int i)
	{
		this.i = i;
		System.out.println("Inside A's one args");
	}
	
	public void disp()
	{
		System.out.println("Value of i in First's disp="+i);
	}
}

class Second
{
	int i;
	Second(int i)
	{
		this.i = i;
		System.out.println("Inside B's one args");
	}
	
	public void disp()
	{
		System.out.println("Value of i in Second's disp="+i);
	}
}

public class Two

{
	public static void main(String args[])
	{
		First f1 = new First(20);
		f1.disp();
		
		First f2 = new First(30);
		f2.disp();
		
		Second s1 = new Second(200);
		s1.disp();
		
		Second s2 = new Second(300);
		s2.disp();
	}
}