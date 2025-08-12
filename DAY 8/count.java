import java.util.*;
class div
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number:");
		int a=sc.nextInt();
		System.out.println("enter final number:");
		int b=sc.nextInt();
	    int count=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
		     count++;
			}
		}
		System.out.println("number of even numbers:"+count);

	}
}