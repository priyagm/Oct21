package Practice;

public class Mcons
{
 int a; int b; float c;
 Mcons()
 {
	 a=10;b=20;
 }
 Mcons( int x, int y)
 {
	 a=x; b=y;
 }
 Mcons(int l, float n ) 
 {
	 a=l; c=n;
 }
 
 public static void main(String[] args)
 {
	Mcons m=new Mcons();
	m.mecthod();
	Mcons m1=new Mcons(20,30);
	m1.mecthod();
	Mcons m2=new Mcons(30,40.45f);
    m2.mecthod();

 }
	
 public void mecthod()
 { 
	System.out.println(a+b+c); 
 }}
 
