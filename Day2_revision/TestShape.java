/*1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.
*/

class Shape
{
	private int width, height;
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height; 
	}
	
	public void getWidth()
	{
		System.out.println(width);
	}
	
	public void getHeight()
	{
		System.out.println(height);
	}
	

}

public class TestShape
{
	public static void main(String []args)
	{
		Shape s = new Shape();
		
		s.getHeight();
		s.getWidth();
		
		s.setHeight(10);
		s.setWidth(20);
		
		s.getHeight();
		s.getWidth();
		
	}
}