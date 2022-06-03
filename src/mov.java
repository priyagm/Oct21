
public class mov
{
	public void method()
	{   int a=10; int b=20;
	int c=a+b;
		System.out.println(c);
	}
	public void method(int m,int n)
	{ int o=m+n;
		System.out.println(o);	
	}
	public void method( int x,int y, int z)
	{   int u= x+y+z;
		System.out.println(u);
	}
	public void method(float h,float i)
	{ float k= h+i;
		System.out.println(k);
	}
	public static void main(String[] args)
	{
		mov m=new mov();
		m.method();m.method(100, 200);m.method(1000, 2000, 3000);
	m.method(200.20f, 300.30f);
	
	
	
	
	}
	
}
