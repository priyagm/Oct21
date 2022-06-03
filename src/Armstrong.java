
public class Armstrong 
{
	public static void main(String[] args) 
	{
		int numb=371; int remi=0; int sum=0; int temp=numb;
		
		
		
		
		while(numb>0)//37>0,//3>0
		{
			remi=numb%10;// 371%10=1// 37%10=7//3%10=3
			sum=sum+remi*remi*remi;// 0+1*1*1=1//1+7*7*7=344//344+3*3*3=371
			numb=numb/10;//370/10=37//37/10=3
		}
		if(temp==sum)
		{
			System.out.println("its a Armstrong number");
		}
		else

	{
			System.out.println("its not Armstrong number");
	}
		}

}
