/*2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments*/

class MyClass
{
	int i,j;
	MyClass()
	{
		System.out.println("In Myclass No-args.");
	}
	
	MyClass(int i)
	{
		this.i = i;
		System.out.println(i);
		System.out.println("In my Classs with one int args!");
	}
	
	MyClass(int i, int j)
	{
		this.i = i;
		this.j=j;
		System.out.println(i);
		System.out.println(j);
		System.out.println("In my Classs with two int args!");
	}
	
}

public class ClientClass
{
	public static void main(String []args)
	{
		MyClass m1 = new MyClass();
		
		MyClass m2 = new MyClass(10);
		
		MyClass m3 = new MyClass(20,30);
	}
}