
public class parent1 {
	int a=10;

public void addition() 
{
	int b=20; int c=a+b;
	System.out.println("addition method with no parameter"+c);
}
public void addition(int d) 
{ 
	int e= a+d;
	System.out.println("adiition method with 1 int="+e);
}
public void addition(int f, int g) 
{ 
	int h= a+f+g;
	System.out.println("addition method with 2 int="+h);
}
public void addition(String s) 
{
	System.out.println("addition method with string="+s);
}
public void addition(float i,int j) 
{ double k=a+i+j;
	System.out.println("addition method with 1 float and 1 int="+k);
}
	}


