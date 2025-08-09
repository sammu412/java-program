import java.util.*;
class tri
{
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter sides of triangle");
	System.out.println("enter side A:");
	double a=sc.nextDouble();
	System.out.println("enter side B:");
	double b=sc.nextDouble();
	System.out.println("enter side C:");
	double c=sc.nextDouble();
	if(a==b && c==a)
	 {
		System.out.println("this is equilateral");
	
	 }
	 else if(a==b || b==c || a==c)
	 {
		 
		System.out.println("this is isosceles");
	 }
	 else
	 {
		System.out.println("this is scalene"); 
	 }
	}
}