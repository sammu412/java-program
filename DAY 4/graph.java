import java.util.*;
class graph
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X value:");
		int x=sc.nextInt();
		System.out.println("Enter Y value:");
		int y=sc.nextInt();
		if(x>0 && y>0)
		{
			System.out.println("quadrant 1");
		}
		else if(x<0 && y>0)
		{
				System.out.println("quadrant 2");
		}
		else if(x<0 && y<0)
		{
				System.out.println("quadrant 3");
		}
		else if(x>0 && y<0)
		{
				System.out.println("quadrant 4");
		}
		else
		{
			System.out.println("invalid");	
		}
	}
}