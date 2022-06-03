package Practice;
//1221
public class revprsc 
{
public static void main(String[] args)
{
	int num = 1221; int rem=0; int rev=0; int temp=num;
	while(num>0)
	{ 
	rem=num%10;
	 rev=rev*10+rem;
	 num=num/10;
	
	}
	System.out.println(rev);
	if(temp==rev)
	{
		System.out.println("its palindrome");
	}
	
	else
	{
		System.out.println("its not palindrome");
	}
}
}
