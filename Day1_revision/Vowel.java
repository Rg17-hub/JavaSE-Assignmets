//2)	using switch ….case   display whether character is vowel or not.

import java.util.Scanner;

public class Vowel
{
	public static void main(String []args)
	{
		char ch;
		int number;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Please Enter a character:");
		ch = sc.next().charAt(0);
		System.out.println("If you wish to exit,Press 1. If you wish to continue press any other number");
		number = sc.nextInt();
		switch(ch)
		{	
			case 'A':
			case 'a':
			System.out.println("Entered Character is vowel");
			break;
			case 'E':
			case 'e':
			System.out.println("Entered Character is vowel");
			break;
			case 'I':
			case 'i':
			System.out.println("Entered Character is vowel");
			break;
			case 'O':
			case 'o':
			System.out.println("Entered Character is vowel");
			break;
			case 'U':
			case 'u':
			System.out.println("Entered Character is vowel");
			break;
			
			default:
			System.out.println("Entered Character is consonent");
			
			
		}
		}while(number !=1);
	}
}