
class Check
{
	 String s1 = "Default String";
	private String s2 ="Private String";
	protected String s3 = "Protected String";
	public String s4 = "Public String";
	
	public void disp()
	{
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
}

public class CheckDemo
{
	public static void main(String args[])
	{
		Check c = new Check();
		c.disp();
	}
}