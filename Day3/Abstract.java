/*5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.
*/

abstract class Shape
{
	abstract public void draw();
}

class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Inside Tringle's draw");
	}
}

class Polygon extends Shape
{
	public void draw()
	{
		System.out.println("Inside Polygon's draw");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Inside Circle's draw");
	}
}

public class Abstract
{
	public static void main(String args[])
	{
		
		//System.out.println("Inside Abstarct");
		Shape arr[] = new Shape[3];
		
		arr[0] = new Triangle();
		arr[0].draw();
		
		arr[1] = new Polygon();
		arr[1].draw();
		
		arr[2] = new Circle();
		arr[2].draw();
	}
}