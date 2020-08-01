//4)Show the example of single level inheritance with constructor invocation.

class Base
{
	Base()
	{
		System.out.println("In Base class no-args");
	}

}

class Sub extends Base
{
	Sub()
	{
		System.out.println("In Sub no-args");
	}
}


class SingleLevelInheritance
{
	public static void main(String args[])
	{
		Sub s = new Sub();
	}
}