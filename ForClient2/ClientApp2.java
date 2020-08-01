package clientpro2;

import studpack.Student;

public class ClientApp2 
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setName("Girish");
		s1.setAge(25);
		s1.setAddress("Mumbai");
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getAddress());
				
		Student s2 = new Student("Mahesh", "Solapur", 22);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getAddress());
				
	}
}
