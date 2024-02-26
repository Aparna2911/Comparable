package practice;
class ConstructorChaining
{
	ConstructorChaining(int x, int y)
	{
		System.out.println(x * y);
	}
	
	ConstructorChaining(int x)
	{
		this(5, 15);
		System.out.println(x);
	}
	ConstructorChaining()
	{
		this(5);
		System.out.println("The Default constructor");
	}
	public static void main(String args[])
	{
		new ConstructorChaining();
	}
}
