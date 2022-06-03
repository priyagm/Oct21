package Practice;

public class constructor
{
int a; int b;
constructor()
{
	a=10; b=20;
}
public static void main(String[] args) 
{
	constructor c=new constructor();
	c.method();
	
}
public void method()
{
	System.out.println(a+b);
}

}
