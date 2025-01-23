package abstraction;

public class Abstractex2 extends Abstractex1
{

	public static void main(String[] args) 
	{
		Abstractex1 ref=new Abstractex2();
		ref.display();
		ref.show();
		
	}

	@Override
	public void display() 
	{
		System.out.println("this is the child class ");
	}
	
	public void show1()
	{
		System.out.println("This is the non abstract method ");
	}

}
