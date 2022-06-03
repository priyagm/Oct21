package Practice;

public class Methodoverloading
{ static int x=100;

public static void method(int a)
{ int p=x+a;
	System.out.println(p);
}
public void method(int b,int c)
{  int q=x+b+c;
	System.out.println(q);
}
public void method(int d, int e,int f)
{ int r=x+d+e+f;
	System.out.println(r);
}
public void method(int g, float h)
{ float s=x+g+h;
	System.out.println(s);
}
public void method(float i,float k)
{ float t=x+i+k;
	System.out.println(t);
}
public static void main(String[] args) 
{
	Methodoverloading ml=new Methodoverloading();
	ml.method(20, 30);
	ml.method(10, 20, 30);
	ml.method(10, 20.2f);
	ml.method(10.5f, 20.5f);
	Methodoverloading.method(30);
}
}

