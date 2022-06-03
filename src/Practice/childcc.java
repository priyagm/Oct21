package Practice;

public class childcc extends parentabstract
{

	
	public void method2() 
	{
		
		System.out.println("method2");
	}

	
	public void method3() 
	{
		
		System.out.println("method3");
	}

	
	public void method4() {
		
		System.out.println("method4");
	}

	
	public void method5() {
		
		System.out.println("method5");
	}
	public static void main(String[] args) 
	{
		childcc cc=new childcc();
		cc.method2();
		parentabstract.method1();
		cc.method2();
		cc.method3();
		cc.method4();
		cc.method5();
	}


	
	

}
