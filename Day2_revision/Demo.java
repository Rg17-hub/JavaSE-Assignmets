/*5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.*/
	
	class A
	{
		private int i;
		private static int j;
		
		
		
		A()
		{
			System.out.println("Inside A no-args");
		}
		
		private static void disp()
		{
			System.out.println("Inside A private Static");
		}
		
		static
		{
			System.out.println("Inside A static Block");
		}
		
		private void disp1()
		{
			System.out.println("Inside A private disp");
		}
		
	
	}
	
		class B
	{
		protected int i;
		protected static int j;
		
		
		
		
		B()
		{
			System.out.println("Inside B no-args");
		}
		
		protected static void disp()
		{
			System.out.println("Inside B protected Static");
		}
		
		protected void disp1()
		{
			System.out.println("Inside B protected disp");
		}
		
		static
		{
			System.out.println("Inside B static Block");
		}
	}
	
			class C
	{
		public int i;
		public static int j;
		
		static
		{
			System.out.println("Inside C static Block");
		}
		
		
		C()
		{
			System.out.println("Inside C no-args");
		}
		
		public static void disp()
		{
			System.out.println("Inside C public Static");
		}
		
		public void disp1()
		{
			System.out.println("Inside C public disp");
		}
	}
	
	class Demo
	{
		
		static
		{
			System.out.println("Inside Demo static Block");
		}
		
		public static void main(String args[])
		
		{
			//A.disp(); private static. Can't access
			A a1 = new A();
			//a1.disp1();  private. Can't access
			
			B.disp();
			
			B b1 = new B();
			b1.disp1();
			
			C.disp();
			
			C c1 = new C();
			
			c1.disp1();
		}
	}
	
	