/*3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?*/

class Emp
{
	private static int cnt=20;
	public static void disp()
	{
		System.out.println("Value of Static cnt="+cnt);
	}
}

public class TestEmp
{
	public static void main(String []args)
	{
		Emp.disp();
	}
	
}