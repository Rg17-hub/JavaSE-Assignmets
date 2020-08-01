//5)Show the example of multi-level inheritance with constructor invocation.

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
		System.out.println("In Sub1 no-args(Immidiate Parent)");
	}
}

class Sub extends Sub1
{
	Sub()
	{
		System.out.println("In Sub no-args");
	}
}


class MultiLevelInheritance
{
	public static void main(String args[])
	{
		Sub s = new Sub();
	}
}