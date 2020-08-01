/*create a hierarchy

				Animal

					void makeSound()
					
override "makeSound()" in all the child classes.

		Dog		Cat		Tiger
							void hunting()



write a class "AnimalDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any animal and invoke "makeSound()" function.

	also make sure if "Tiger" is passed , its "hunting()" method also should be called.*/
	
class Animal
{
	void makeSound()
	{
		
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("BHU BHU");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Meaw Meaw");
	}
}

class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("ROAR");
	}
	
	void Hunting()
	{
		System.out.println("Tiger is Hunting");
	}
}

class AnimalDemo
{
	public static void perform(Animal ref)
	{
		ref.makeSound();
		
		if(ref instanceof Tiger)
		{
			Tiger t = (Tiger)ref;
			t.Hunting();
		}
	}
	public static void main(String args[])
	{
		perform(new Dog());
		perform(new Cat());
		perform(new Tiger());
	}
}