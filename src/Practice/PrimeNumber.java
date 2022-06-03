package Practice;

public class PrimeNumber 
{
public static void main(String[] args) 
{
	int lower=1;
	int higher=20;
	for(int i=lower; i<=higher;i++)//13
	{
		int count=0;
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
