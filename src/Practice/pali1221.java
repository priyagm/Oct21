package Practice;

public class pali1221 
{
public static void main(String[] args) 
{
	int num=1221; int rem=0; int rev=0; int temp=num;
	    
	
while(num>0)	
{
	rem=num%10;   // 1,2
	rev= rev*10+rem;//1,
	num=num/10;
}
	
	System.out.println(rev);
	if (temp==rev)
	{
		System.out.println("its a palindrome");
	}
	else
	{
		System.out.println("its not palindrome");
	}
}
}
