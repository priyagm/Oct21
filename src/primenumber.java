
public class primenumber 
{
	public static void main(String[] args) 
	
	{
		int lower =1;
		int higher=10;
		for(int i=lower; i<higher;i++)

		{
			int count=0;
			for(int j=2; j<i;j++)
			{
				
				if(i%j==0)
				{
					
					count++;
				}
			}
			if (count==0)
			{System.out.println(i);}
		}

}}
