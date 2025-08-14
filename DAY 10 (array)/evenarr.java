import java.util.*;
class arr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int  i=0;i<n;i++)
		{
			System.out.println("enter the value a["+i+"]");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
		if(a[i]%2==0)
		{
					System.out.println(" array value of "+i+" is "+a[i]);
		}
		else
		{
				System.out.println("No even values in the array "+i);
		}
		}
		
	}
}