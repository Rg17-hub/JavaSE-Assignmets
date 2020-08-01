/*1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.*/

  class Shape
{
	private int width, height;
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public void display()
	{
		System.out.println("Width= "+getWidth());
		System.out.println("Height= "+getHeight());
	}
}

public class call

{
	public static void main(String []args)
	{
		Shape s1 = new Shape();
		
		s1.setWidth(10);
		s1.setHeight(20);
		s1.display();
	}
}