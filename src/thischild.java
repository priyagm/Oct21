
public class thischild extends superparent
{ 
	int a=100; int b=200;

	public void method ()
	{  int a=10; int b=20; int c=a+b+this.a+super.a;
		System.out.println(c);
	}
	public void method1()
	{ int z=this.b+super.b;
		System.out.println(z);
		}
	public static void main(String[] args)
	{
		thischild tc=new thischild();
		System.out.println(tc.a);
		tc.method();
		tc.method1();
		
		
	}
}


