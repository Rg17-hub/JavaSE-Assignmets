//1)	display a table of a particular number   
import java.util.*;
public class Table
{
 public static void main(String []args)
 {
  int number, table;
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter a number=");
  number= sc.nextInt();
  System.out.println("Table of entered number:");
  for(int i=1;i<11;i++)
  {
	table= number * i;
	System.out.println(table); 
  }
 }
}