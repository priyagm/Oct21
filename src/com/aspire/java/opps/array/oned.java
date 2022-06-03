package com.aspire.java.opps.array;

import java.util.Arrays;

public class oned 
{
public static void main(String[] args) 
{
	int []a= {1,2,3,4,5,6,7,8,9};
	int []e= {11,12,13,14,15};
	int []f= {16,17,18,19,20,21,22,23};
	String z[]= {"priyanka","manhallikar"};
	
	for(int y=0;y<z.length;y++)
	{System.out.print(z[y]+" ");}
	
	System.out.println();
	
	System.out.println("index 8 is 9= "+a[8]);
	
	int sum=a[3]+e[2];
	
	System.out.println("a[3]+e[2]="+sum);
	int[] b= {2,24,32,33,4568,2,45,22};
	System.out.println("sorting");
Arrays.sort(a);
	for(int c=0;c<a.length;c++)
	{
		System.out.print(a[c]+" ");
	}
	System.out.println();
	
	
	System.out.println("length of 'a' varibale="+a.length);
	System.out.println("length of 'f'variable="+f.length);
	int[] i= new int[7];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	i[4]=5;
	i[5]=6;
	i[6]=7;
	System.out.println("length of i variable"+i.length);
	
	
	
	}
}
