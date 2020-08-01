/*3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?*/

public class Emp
{
	private static int cnt = 24;
	
	public void display()
	{
		System.out.println(cnt);
	}
	
	public static void display1()
	{
		System.out.println(cnt);
	}
	
	public static void main( String []args)
	{
		Emp e1 = new Emp();
		e1.display();	
		e1.display1();
	}
}