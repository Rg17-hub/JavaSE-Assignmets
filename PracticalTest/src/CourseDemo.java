interface Course
{
	void start();
}

class Dac implements Course
{
	public void start()
	{
		System.out.println("Dac Start");
	}
}

class Dbda implements Course
{
	public void start()
	{
		System.out.println("Dbda Start");
	}
}

class MSCIT implements Course
{
	public void start()
	{
		System.out.println("MSCIT Start");
	}
}

public class CourseDemo 
{
	public static void main(String args[])
	{
		Course arr[] = new Course[3];
		
		arr[0] = new Dac();
		arr[1] = new Dbda();
		arr[2] = new MSCIT();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].start();
		}
	}
}
