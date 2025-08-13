import java.util.*;
class prime
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int count=0;
	for(int j=1;j<=n;j++)
	{
		if(n%j==0)
		count+=1;
	}
	if(count>2)
	{
		System.out.println("this is not a prime number");
	}
	else
	{
		System.out.println("this is a prime number");
	}
	}
}