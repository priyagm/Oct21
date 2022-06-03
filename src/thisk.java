
public class thisk extends superk
{
int a=100;
public void addition()
{ int a=10; int c= this.a+a+super.a;
	 System.out.println(c);
}
public static void main(String[] args) 
{
	thisk k =new thisk();
	k.addition();
}
}
