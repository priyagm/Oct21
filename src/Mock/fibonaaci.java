package Mock;

public class fibonaaci {
	public static void main(String[] args) 
	{
		int a[]=new int[10];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=a.length-1;i++)
		{
			
			a[i]=a[i-1]+a[i-2];
		}
		for(int j=0; j<=a.length-1;j++)
		{
			
			System.out.println(a[j]);
		}
		
		
		
	}

}
