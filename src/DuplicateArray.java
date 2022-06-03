import java.util.HashMap;
import java.util.HashSet;

public class DuplicateArray 
{ public static void main(String[] args) {
	

int a[]= {1,2,3,4,5,2};
HashSet hs=new HashSet();
for(int dup:a)
{
	if(hs.add(dup)==false)
	{
		System.out.println(dup);
	}
}
}}
