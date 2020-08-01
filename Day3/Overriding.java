//7)Define a parent and a child class . Now explain function overriding with Example.

class Parent
{
	public void disp()
	{
		System.out.println("Inside Parent's disp"); //overridden
	}
}

class Child extends Parent
{
	public void disp()
	{
		System.out.println("Inside Child's disp"); //overriding
	}
}

public class Overriding
{
	public static void main(String args[])
	{
		Parent c = new Child();
	    c.disp();
	}
	
}