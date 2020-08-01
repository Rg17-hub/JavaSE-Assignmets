/*1) initialize a single dimension array and sort it in ascending order.*/

import java.util.Scanner;
public class OneDArray
{
	public static void main(String args[])
	{
		int size, temp;
		System.out.println("Enter size of an array=");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Please Enter array Elements=");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("You've entered:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("After sorting in Ascending order:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}