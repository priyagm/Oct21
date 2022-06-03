
public class Constructor 
{
int a; int c;
int b;
Constructor()
{
a=10; b=20;
}
public void method()
{
	int c=a+b;
	System.out.println(c);
			
}
public static void main(String[] args) 
{
	Constructor c=new Constructor();
	c.method();
	
	
	
	
	
	
}
}
