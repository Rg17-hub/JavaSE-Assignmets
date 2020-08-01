/*4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)*/

public class DemoOb
{
	private int number;
	
	DemoOb()
	{
		System.out.println(number);
	}
	
	public void display()
	{
		System.out.println(number);
	}
	
	
	
	public static void main(String []args)
	{
		DemoOb d1 = new DemoOb();
		
		DemoOb d2 = d1;
		
		d2.display();
	}
}