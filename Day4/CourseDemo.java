/*create a hierarchy

				Course

					void start()
					void end()

override "start()" and "end()" in all the child classes.

		MsCit		Basic		Dbda
							void orientation()



write a class "CourseDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any course and invoke "start()" and "end()" functions.

	also make sure if "Dbda" is passed , its "orientation()" method also should be called.*/
	
	
 class Course
{
	 public void start()
	 {
		 
	 }
	 public void end()
	 {
		 
	 }
}

class MsCit extends Course
{
	public void start()
	{
		System.out.println("MsCit Start");
	}
	
	public void end()
	{
		System.out.println("MsCit End");
	}
}

class DAC extends Course
{
	public void start()
	{
		System.out.println("DAC Start");
	}
	
	public void end()
	{
		System.out.println("DAC End");
	}
}

class DBDA extends Course
{
	public void start()
	{
		System.out.println("DBDA Start");
	}
	
	public void end()
	{
		System.out.println("DBDA End");
	}
	
	public void orientation()
	{
		System.out.println("DBDA orientation");
	}
}

class CourseDemo
{
	public static void perform(Course ref)
	
	{
		ref.start();
		ref.end();
		
		if(ref instanceof DBDA)
			
			{
				DBDA d = (DBDA)ref;
				d.orientation();
			}
			
	}
	
	public static void main(String args[])
	{
		perform(new MsCit());
		perform(new DAC());
		perform(new DBDA());
	}
	
}