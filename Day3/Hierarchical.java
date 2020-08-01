//6)Show the example of hierarchical inheritance with constructor invocation.

class Base
{
	Base()
	{
		System.out.println("In Base class no-args");
	}

}

class Sub1 extends Base
{
	Sub1()
	{
		System.out.println("In Sub1 no-args");
	}
}

class Sub extends Base
{
	Sub()
	{
		System.out.println("In Sub no-args");
	}
}


class Hierarchical
{
	public static void main(String args[])
	{
		Sub s = new Sub();
		
		Sub1 s1 = new Sub1();
	}
}