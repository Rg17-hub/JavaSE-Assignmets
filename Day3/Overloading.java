/*8)Define a parent class with one function. 
Define child class with the function having same name as of parent class function, but having different argument.
Create an instance of child class and call the functions. Make sure u have followed the concept of “function overloading “ in inheritance.*/

class Parent
{
	public void disp()
	{
		System.out.println("Inside base disp");
	}
}

class Child extends Parent
{
	String s1;
	public void disp(String s) //overloading
	{
		this.s1 = s;
		System.out.println("String in Child="+s1);
	}
}

public class Overloading
{
	public static void main(String args[])
	{
		Child c = new Child();
	    c.disp("Girish");
		c.disp();
	}
	
}