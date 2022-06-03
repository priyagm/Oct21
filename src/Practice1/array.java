package Practice1;

import java.util.Arrays;

public class array 
{
public static void main(String[] args) 
{
	int a[]= {2,5,61,5,7,1,3,9};
	Arrays.sort(a);
	for(int i=0; i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}
	System.out.println();
	for(int i=a.length-1; i>=0;i--)
	{
		System.out.print(a[i]+",");
	}
}
}
