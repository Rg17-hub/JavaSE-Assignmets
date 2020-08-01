/*4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)*/

public class DemoOb
{
	int i;
	DemoOb()
	{

		System.out.println("In DemoOb No-args");
	}
	
	public void get(int i)
	
	{
		this.i = i;
	}
	
	public void disp()
	{
		System.out.println("Value of i="+i);
	}
	
	public static void main(String args[])
	{
		DemoOb d1 = new DemoOb(); //instance of DemoOb.
		
		DemoOb d2 = d1; //assigning reference created to instance.
		
		d2.get(30);
		
		d2.disp();
		d1.disp();
	}
}