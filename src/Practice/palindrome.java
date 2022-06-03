package Practice;
//242
public class palindrome
{
	
	public static void main(String[] args) {
		
	
 int num=1221; int temp=num;
 int rem=0;
 int rev=0;
 
 while(num>0)
 {
  rem = num%10;
  rev= rev*10+rem;
  num=num/10;
		  }
 System.out.println(rev);
 
 if (temp==rev)
 {
	 System.out.println("its planodrome");
 }

 else
	{
	 
	 System.out.println("its not apalindrome");
	}
 
	}}
