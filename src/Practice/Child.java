package Practice;

public class Child implements parent1,parent
{

	
	public void method4() 
	{
		
		System.out.println("from method 4");
	}

	
	public void method5()
	{
		System.out.println("from method 5");
		
	}

	
	public void method6()
	{
		System.out.println("from method 6");
	}

	
	public void method() 
	{
		System.out.println("from method ");
		
	}

	
	public void method2() 
	{
		
		System.out.println("from method 2");
	}

	
	public void method3()
	{
		System.out.println("from method 3");
		
	}
	public static void main(String[] args)
	{
		Child c=new Child();
		c.method();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		c.method6();
	}

}
