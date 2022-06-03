
public class Const 
{
int a; int b;

Const()
{
	a=10; b=20;
}
Const(int p, int q)
{
	a=p; b=q;
}
Const(int x, int y, int z)
{
	a=x; b=y+z;

}
public void addition()
{
	
System.out.println(a+b);
}
public static void main(String[] args) 
{
	Const c=new Const();
	c.addition();
	Const c1=new Const(100,200);
	c1.addition();
	Const c2=new Const(1000,2000);
	c2.addition();
	
}
}
