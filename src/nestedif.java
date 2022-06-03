
public class nestedif {
	public static void main(String[] args) {
		String un="priyanka";
		String pwd="priyanka@123";
		int pin =12345; String name="priya";
	
		//System.out.println("enter username:");
		if(un=="priyanka")
		{
			System.out.println("ussername is correct");
		
		if(pwd=="priyanka@123")
		
		{
			System.out.println("passwordd is correct");
			
			System.out.println("login to the sytem is correct");
			
			if(pin==12345)

				{
				System.out.println("pin is correct");
				if (name=="priya")
				{
					System.out.println("its corect value");
				}
				else
				{
					System.out.println("its wrong value");
				}
				}
			else
			{
				
				System.out.println("pin is wrong");
			}
			
		}
		else
		{
			System.out.println("password is wrong");
		
		}
		
		}
		else
		{
			System.out.println("username is wrong");}
		}
	
}
