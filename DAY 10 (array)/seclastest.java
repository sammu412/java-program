import java.util.*;
class sec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<s;i++)
		{
			System.out.println("enter the array "+i+" element:" );
			a[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(a[i]>a[j])
				{
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
				}
			}
		}
		   System.out.print("a[]={");
		   for(int i=0;i<s;i++)
	     	{
	        	System.out.print(a[i]+",");
	    	}
	   	System.out.print("}");
		System.out.println("second lastest value is:"+a[a.length-2]);
	}
}