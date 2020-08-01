//5)	Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  

import java.util.*;
public class Result
{
	public static void main(String []args)
	{
		int marks;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter your marks:");
	marks = sc.nextInt();
	
	if(marks>75)
		System.out.println("You got Distinction.:)");
	else if(marks>=60)
		System.out.println("You got First Class.:)");
	else if(marks>=55)
		System.out.println("You got Second Class.");
	else if(marks>=40)
		System.out.println("You got Third Class.");
	else
		System.out.println("You failed!!!");
	}
}