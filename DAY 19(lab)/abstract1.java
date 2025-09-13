import java.lang.*;
abstract class a1
{
	abstract void add(int a,int b);
	void sub(int a,int b)
	{
		System.out.println("subtraction "+(a-b));
	}
}
class a2 extends a1{
	public void add(int a,int b)
	{
		System.out.println("addition "+(a+b));
	}
	void mul(int a,int b)
	{
		System.out.println("multiplication "+(a*b));
	}
}
public class abstract1{
	public static void main(String args[])
	{
		a2 obj=new a2();
		obj.add(2,3);
		obj.sub(2,3);
		obj.mul(2,3);
		
	}
}