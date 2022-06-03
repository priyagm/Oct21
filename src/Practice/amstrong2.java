package Practice;
//153
public class amstrong2
{
	public static void main(String[] args) 
	{
		int num=153; int temp=num;
		int rem=0;int sum=0;
		
		while(num>0)
		{
			rem=num%10;//3
		sum=sum+rem*rem*rem;//3
		num=num/10;//15
		}
				
		System.out.println(sum);
		
		if (temp==sum)
		{
			System.out.println("its amstrong number");
		}
		else
		{
			System.out.println("its not amstrong number");
		}
	}

}
