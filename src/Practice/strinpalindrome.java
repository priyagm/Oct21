package Practice;
//abccba
public class strinpalindrome 
{
	public static void main(String[] args) {
		
	
 String a="abccba"; String rev="";
     
 
 
 for(int i=a.length()-1;i>=0;i--)
 {
	 rev=rev+a.charAt(i);
 }
	
if(a.equals(rev))
{
	System.out.println("its plaibdrome");
}

else
{
  System.out.println("its not palondrome");	
}
}}