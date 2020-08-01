interface Vehicle
{
	void start();
	
}

class TwoWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Inside start method of TwoWheeler");
	}
	
}

class ThreeWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Inside start method of ThreeWheeler");
	}
	
}

class FourWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Inside start method of FourWheeler");
	}
	
}

class VDemo

{
	public static void main(String args[])
	{
		Vehicle v = new FourWheeler();
		
		v.start();
	}
}