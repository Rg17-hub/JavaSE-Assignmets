/*2) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.*/

import java.util.Scanner;
public class MyCalcApp 
{
	public static void main(String args[])
	{
		int number;
		System.out.println("Enter a number=");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		Calculator c = new Calculator();
		try
		{
			System.out.println("Double of your entered number is="+c.calDouble(number));
		}
		
		catch(MyArithException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Done!");
		}
		
	}
}
