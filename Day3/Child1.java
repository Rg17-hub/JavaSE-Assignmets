/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/

class Parent1
{
	Parent1()
	{
		System.out.println("Inside Parent1 no-args");
	}
	
	public void disp()
	{
		System.out.println("Inside Parent1 disp");
	}
}

interface Parent2
{
		
	public void disp();
	
}

class Child1 extends Parent1 implements Parent2
{
	Child1()
	{
		System.out.println("Inside Child1 no-args");
	}
	public void disp()
	{
		System.out.println("Inside child1 disp");
	}
	
	public static void main(String args[])
	{
		Child1 c = new Child1();
		c.disp();
		
		System.out.println("...........................");
		Parent1 p1 = new Child1();
		p1.disp();
		System.out.println("...........................");
		Parent2 p2 = new Child1();
		p2.disp();
		
		System.out.println("...........................");
		
		Parent1 p = new Parent1();
		p.disp();
	}
}