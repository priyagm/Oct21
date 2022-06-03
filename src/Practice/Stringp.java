package Practice;

public class Stringp
{
public static void main(String[] args)
{
	String s1= "priyanka manhallikar bidar";
	String s2="bidar";
	String s3=" ";
	String s4="priyAnka"; String s5="Priyanka";
	System.out.println(s1.charAt(3));
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.lastIndexOf('a'));
	System.out.println(s1.indexOf('m'));
	System.out.println(s1.concat(s3).concat(s2));
	System.out.println(s1.contains(s2));
	System.out.println(s1.endsWith(s2));
	System.out.println(s1.equals(s2));
	System.out.println(s1.isEmpty());
	System.out.println(s1.replace("priyanka", "Priyanka"));
	System.out.println(s1.toUpperCase());
	System.out.println(s4.equals(s5));
	System.out.println(s4.toLowerCase().equals(s5));
	System.out.println(s4.toLowerCase().contains(s5.toLowerCase()));
System.out.println(s1.endsWith("ar"));
System.out.println(s1.substring(2));
System.out.println(s1.substring(0, 5));
System.out.println(s1.lastIndexOf('a'));
	
	
}
}
