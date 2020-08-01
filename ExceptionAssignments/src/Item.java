
public class Item 
{
	String itemId, name;
	int cost;
	
	Item(String itemId, String name, int cost)
	{
		this.itemId = itemId;
		this.name = name;
		this.cost = cost;
	}
	
	void display()
	{
		System.out.println("itemId="+itemId);
		System.out.println("name="+name);
		System.out.println("cost="+cost);
	}
	
	public static void main(String args[])
	{
		Item i = new Item("1","Earphones",700);
		i.display();
		
	}
}
