package abstraction;

public class Abstractchild extends abstractparent
{

	public static void main(String[] args) 
	{
		Abstractchild obj=new Abstractchild();
		obj.display();
		obj.add();
		obj.display1();
		
	}

	@Override
	public void add() 
	{
		int sum=5+5;
		System.out.println("Sum is: " +sum);
	}
	
	public void display1()
	{
		System.out.println("This is the Abstract Child class");
	}

}
