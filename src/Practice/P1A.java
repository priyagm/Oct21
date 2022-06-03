package Practice;

import java.util.Arrays;

public class P1A 
{
public static void main(String[] args) 
{
	int a[] = {1,2,3,4,5,6,7,8,9,0};
	System.out.println(a.length);
	int b[] = {15,16,18,22};
	int c[] = {21,22,24,22};
	int sum =a[3]+b[3];
	int multi =b[0]*c[0];
	System.out.println(multi);
	System.out.println(sum);
	Arrays.sort(c);
	for(int i=0; i<c.length;i++)
		
	{
		
		System.out.print(c[i]+";");
	}
	System.out.println();
	for(int j=c.length-1;j>=0;j--)
	{
		System.out.print(c[j]+";");
	}
	}}
