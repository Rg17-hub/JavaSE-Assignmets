//5) Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  

class Result
{
	public static void main(String [] args)
	{
		int marks=32;

		if(marks>=75)
		{
			System.out.println("Distinction");
		}
		else if(marks<=74 && marks>=60)
		System.out.println("First Class");
		
		else if(marks>=50 && marks<60)
		System.out.println("Second Class");
	
		else
		System.out.println("Fail!");
		
	}
}