/*2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments*/

public class MyClass
{
	private int number;
	String name;
	
	MyClass()
	{
		number = 10;
		System.out.println(number);
	}
	
	MyClass( int number)
	{
		this.number = number;
		System.out.println(number);
	}
	
	MyClass(int number, String name)
	{
		this.name = name;
		this.number = number;
		
		System.out.println(number + " " + name);
	}
	
	public static void main(String []args)
	{
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass(20);
		MyClass m3 = new MyClass(30, "Girish");
	}
}