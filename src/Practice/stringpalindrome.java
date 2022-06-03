package Practice;
// abcCba
public class stringpalindrome 
{
public static void main(String[] args) 
{
	String s="abcCba";
	String rev="";
	 for(int i=s.length()-1;i>=0;i--)
	 {
		rev=rev+s.charAt(i);
		 
	 }
	 System.out.println(rev);
	 if(s.equalsIgnoreCase(rev))
	 {
		 System.out.println("its palindrome");
	 }
	 else
	 {
		 System.out.println("its not palindrome");
	 }
}
}
