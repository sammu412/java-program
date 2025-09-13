import java.lang.*;
class a1
{
	void msg()
	{
		System.out.println("hello");
	}
}
interface a2
{
	public void sub(int a,int b);
	public void mul(int a,int b);
}
public class inheritance extends a1 implements a2
{
	public void sub(int a,int b)
	{
		System.out.println("add "+(a-b));
	}
	public void mul(int a,int b)
	{
		System.out.println("mul "+(a*b));
	}
	public static void main(String args[])
	{
	  inheritance obj=new inheritance();
	  obj.sub(12,4);
	  obj.mul(23,2);
	 obj.msg();
	}
}