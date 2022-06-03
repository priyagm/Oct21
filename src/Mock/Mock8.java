package Mock;
//method overloading(complie time polymorphism)
public class Mock8 
{
public void method()
{
	int a=10; int b=20; int c=a+b;
	System.out.println(c);
}
public void method(int c, int d) 
{ 
	int x=c+d;
	System.out.println(x);  /// 1542.11444
}
public void method(int e, float f)
{
	float y= e+f;
	System.out.println(y);
}

}
