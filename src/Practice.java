
public class Practice 
{
public static void main(String[] args)
{
	int no=121; int rem=0; int rev=0; int temp=no;
	
	
	
	while(no>0)
	{
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	System.out.println(rev);
	if(rev==temp)
	{
		System.out.println("its a palindrome");
	}
	else
	{
		System.out.println("its not a planidrome" );
	}
}

}
