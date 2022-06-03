package Practice1;

public class StrPr 
{
public static void main(String[] args)
{
	String s1="priyanka";
	String s="PrIyanka";
	String s2=" manhallikar";
	String s3=" bidar";
	System.out.println(s1.concat(s2).concat(s3));
	System.out.println(s1.equals(s.toLowerCase()));
	System.out.println(s1.charAt(0));
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.lastIndexOf('a'));
	System.out.println(s1.contains("ka"));
	System.out.println(s1.replace("priyanka", "PRIYANKA"));
	System.out.println(s1.equalsIgnoreCase(s));
	System.out.println(s1.substring(2));
	System.out.println(s1.substring(1, 6));
}}
