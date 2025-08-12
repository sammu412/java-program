import java.util.*;
class fac
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int f=sc.nextInt();
	    int count=1;
		for(int i=1;i<=f;i++)
		{
	
			count=count*i;
		
			
		}
			System.out.println("factorial is:"+count);
	}
}