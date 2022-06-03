
public class palindrome 
{
public static void main(String[] args) 
{
	int numb=151; int rem=0; int rev=0; int temp=numb;
	
	
	while(numb>0)

{
	rem=numb%10;
	rev=rev*10+rem;
	numb=numb/10;

}
	System.out.println(rev);
	if( temp==rev)

	{
		
		System.out.println("its a planidrome");
	}

	else
{
	System.out.println("its not aplaindrome");	
}

}
}
