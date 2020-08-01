
class Shape
{
	public void draw()
	{
		System.out.println("Inside Shape draw!");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Inside Circle draw!");
	}
}

class Polygon extends Shape
{
	public void draw()
	{
		System.out.println("Inside Polygon draw!");
	}
}

class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Inside Rectangle draw!");
	}
}


class ShapeDemo
{
	public static void main(String args[])
	{
		Shape s = new Circle();
		s.draw();
	}
}