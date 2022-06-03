package com.aspire.java.String.program;

public class StringCharacterOccurance 
{
	public static void main(String[] args) {
		
	
String S="priyanka";
char x='a'; int count=0;
for(int i=0;i<=S.length()-1;i++)
{
char y = S.charAt(i);
//System.out.println(y);
if(x==y)
{
	count++;
}

}
System.out.println(count);
}}
