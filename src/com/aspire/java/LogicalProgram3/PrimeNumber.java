package com.aspire.java.LogicalProgram3;

public class PrimeNumber {
	public static void main(String[] args) 
	{
		int lower=1;// lower i
		int higher=10;
		for(int i=lower;i<=higher;i++)//i=10// i=11
		{
			int count=0;// dis count count==0
		for(int j=2;j<i;j++)// j=2 j=2
		{
			if(i%j==0)      //10%2=0 11%2=1
			
			{
				count++;     //1
				
			}
		}
		if(count==0)
		{
			System.out.println(i);
		}
		}
	}

}
