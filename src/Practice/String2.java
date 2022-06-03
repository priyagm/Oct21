package Practice;

public class String2 
{
public static void main(String[] args)
{ String s1="priyanka";
String s2="priyAnka";
String s3 =new String("priyanka");
System.out.println(s1==s3);
System.out.println(s1==s2);
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s2));
	
}
}
