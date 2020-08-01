/*2) Create a class with static and non-static member variables. 
Define static and non-static member functions. 
Create instance of this class and call both static and non-static member functions.*/

public class StaticNonStatic
{
	static int s=20;
	int i =10;
	
	public static void disp()
	{
		System.out.println("Inside Static disp");
		System.out.println("Accessing static member variable s="+s);
		//System.out.println("Accessing Nonstatic member variable i="+i);	//Not possible
	}
	
	public void disp1()
	{
		System.out.println("Inside NonStatic disp");
		System.out.println("Accessing static member variable s="+s);
		System.out.println("Accessing Nonstatic member variable i="+i);	
	}
	
	public static void main(String args[])
	{
		StaticNonStatic.disp();
		StaticNonStatic s = new StaticNonStatic();
		s.disp1();
	}
}