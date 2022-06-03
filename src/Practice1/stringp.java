package Practice1;

public class stringp {

	public static void main(String[] args)
	{
	String s="abccba";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if (s.equals(rev))
	{
		System.out.println("its palindrome");
	}
	else
	{
		System.out.println("its not paindrome");
	}
}
}
