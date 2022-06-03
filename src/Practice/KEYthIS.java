package Practice;

public class KEYthIS extends Ksuper
{
 int a=100; 
 public static void main(String[] args)
 {
	 KEYthIS k=new  KEYthIS ();
	k.addition();
}
 public void addition()
 {
	int a=10; int b=a+this.a; int c=a+this.a+super.a;
	System.out.println(b);
	System.out.println(c);
 }
}
