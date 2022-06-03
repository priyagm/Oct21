package Practice1;

public class Palindrome1 
{
	public static void main(String[] args) {
		
	
int no=121; int remi=0; int rev=0; int temp=no;

while(no>0)
{
remi= no%10;//1/12%10=2/1
rev= rev*10+remi;//1//1*10+remi=10+2=12//11*10+1=121
no=no/10;//121/10=12//1
}
System.out.println(rev);
if(rev==temp)
{
	System.out.println("its a palindrome");
}
else
{
	System.out.println("its not a palindrome");
}
}}
