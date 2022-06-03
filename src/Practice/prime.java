package Practice;

public class prime {
public static void main(String[] args) {
	int lower =10;
	int higher=20;
	for(int i=lower; i<=higher; i++)
	{
	int count=0;
	for(int j=2; j<i;j++)
	{
	if( i%j==0)
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
