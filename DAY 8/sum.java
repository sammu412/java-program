import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int n=125;
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			System.out.println(n);
				System.out.println("rem values"+rem);
				count=count+rem;
				n=n/10;
		}
			System.out.println("sum of digits"+count);
	}
}