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
		  int count=0;
		  int sum=0;
		for(int i=0;i<n;i++)
		{
		if(a[i]%2==0)
		{
			count++;
					
		}
		else
		{
			sum++;
				
		}
		}
		System.out.println("no of even value"+count);
		System.out.println("No of odd values"+sum);
	}
}