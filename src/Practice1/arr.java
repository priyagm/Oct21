package Practice1;

import java.util.Arrays;

public class arr
{
public static void main(String[] args)
{
	int a[]= {2,4,53,1,6,5,7};
	Arrays.sort(a);
	 for ( int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+",");
	 }
	 System.out.println();
	 for(int i=a.length-1; i>=0;i--)
	 {
		 System.out.print(a[i]+",");
	 }
}

}
