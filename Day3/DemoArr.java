/*2) create a class "DemoArr",with the function "disp". create 4 objects of this class in an array.
Traverse the array and invoke "disp" on each objects.*/


public class DemoArr
{
	public void disp()
	{
		System.out.println("Inside DemoArr disp!");
	}
	
	public static void main(String args[])
	{
		DemoArr arr[] = new DemoArr[4];
		for(int i=0;i<arr.length;i++) //creating 4 objects.
		{
			arr[i] = new DemoArr();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].disp();
		}
	}
}