abstract class Account
{
	abstract public void calcInt();
}

class Saving extends Account

{
	public void calcInt()
	{
		System.out.println("Inside Svaing calcInt");
	}
}
class Current extends Account

{
	public void calcInt()
	{
		System.out.println("Inside Current calcInt");
	}
}

class RD extends Account

{
	public void calcInt()
	{
		System.out.println("Inside RD calcInt");
	}
}


public class AcDemo 
{
	public static void perform(Account ref)
	{
		if(ref instanceof Saving)
		{
			ref.calcInt();
		}
	}
	
	public static void main(String args[])
	{
		perform(new Saving());
		perform(new Current());
		perform(new RD());
	}
}
