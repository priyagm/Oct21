package Practice1;
//5*4*3*2*1
public class fact
{
public static void main(String[] args) 
{
	int num=5; int fact=1;
	for(int i=num;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
