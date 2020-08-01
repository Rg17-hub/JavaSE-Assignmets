/*5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.
*/

class A
{
	private static int s=1;
	private int n=2;
	
	static void disp1()
	{
		System.out.println(s);
	}
	 
	void disp2()
	{
		System.out.println(n);
	}	
	
}

 class B
{
	private static int s=3;
	private int n=4;
	
	static void disp1()
	{
		System.out.println(s);
	}
	 
	void disp2()
	{
		System.out.println(s);
	}
	
}

class C
{
	private static int s=5;
	private int n=6;
	
	static void disp1()
	{
		System.out.println(s);
	}
	 
	void disp2()
	{
		System.out.println(n);
	}
	
}

public class Demo1
{
	public static void main(String []args)
	{
		A a1 = new A();
		//a1.disp1();
		a1.disp2();
		
		B b1 = new B();
		//b1.disp1();
		b1.disp2();
		
		C c1 = new C();
		//c1.disp1();
		c1.disp2();
	}
}