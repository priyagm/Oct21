
public class Revers1 
{
	
	public static void main(String[] args) {
		
	
String s="priyanka"; String rev="";
//String a[]=s.split("");
//for(int i=a.length-1; i>=0;i--)
//{
//	System.out.print(a[i]);
//}


//for(int i=s.length()-1;i>=0;i--)
//{
//	
//System.out.print(s.charAt(i)); 
//}

for(int i=s.length()-1;i>=0;i--)
{
	
rev=rev+s.charAt(i);
}
System.out.println(rev);
}}
