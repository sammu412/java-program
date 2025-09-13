import java.lang.*;
interface a2
{
	public void add(int a,int b);
}
interface a4
{
	public void sub(int a,int b);
}
public class inter implements a2,a4
{
	public static void main(String args[])
	{
		inter obj=new inter();
		obj.add(12,2);
		obj.sub(24,7);
	}
	public void add(int a,int b)
	{
		System.out.println("add "+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("sub "+(a-b));
	}
	
}