package clientpro1;

import emppack.Employee;

public class ClientApp1
{
	public static void main(String args[])
	{
		Employee s1 = new Employee();
		s1.setName("Girish");
		s1.setDesig("Software Engineer");
		s1.setSalary(60000.00);
		
		System.out.println(s1.getName());
		System.out.println(s1.getDesig());
		System.out.println(s1.getSalary());
				
		Employee s2 = new Employee("Mahesh", "Student", 0.00);
		System.out.println(s2.getName());
		System.out.println(s2.getDesig());
		System.out.println(s2.getSalary());
				
	}
}
