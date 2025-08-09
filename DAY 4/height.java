import java.util.*;
class height
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your height in centimeters");
		int h=sc.nextInt();
		if(h>=120 && h<140)
		{
			System.out.println("Short");
		}
		else if(h>=140 && h<160)
		{
			System.out.println("Medium");
		}
		else if(h>=160 && h<180)
		{
			System.out.println("Height");
		}
		else{
			System.out.println("Invalid");
		}
	}
}