
public class prime 
{
public static void main(String[] args)
{
	int lower=10; // by 1 or by self11//11/2
	int higher=20;
	
	for(int i=lower; i<=higher;i++)//i=1
	{
		int count =0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
	   if(count==0)
	   {
		   System.out.println(i);
	   }
	}
}
}
