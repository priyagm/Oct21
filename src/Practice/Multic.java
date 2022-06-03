package Practice;

public class Multic 
{ int a; int b; float c;
Multic( )
{
	a=100; b=200;
}
Multic(int x, int y)
{
	a=x;
	b=y;
}
Multic(float e, float f)
{
	c=e+f;
}
 
public static void main(String[] args) 
{
	Multic m= new Multic();
	m.addition();
	//m.sub();
	Multic m1= new Multic(100,200);
	m1.addition();
	//m1.sub();
	Multic m2= new Multic(300.45f,4000.56f);
	m2.addition();
	//m2.sub();
	
	
}
public void addition() 
{
	System.out.println("from addition method="+(a+b+c));
}
public void sub() 
{
	System.out.println("from sub method =" +(c-a));
}
}
