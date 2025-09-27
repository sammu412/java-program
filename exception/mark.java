import java.lang.*;
import java.util.*;
import java.util.InputMismatchException.*;
public class array
{
	public static void main(String args[])
	{
		int[] a=new int[5];
			try{
			System.out.println("array ele is"+a[10]);
	    }catch(InputMismatchException e)
		{
			System.out.println("enter integer value "+e);
		}catch(ArrayIndexOutOfBoundsException e1)
		{
				System.out.println("out of bound exception "+e1);
					System.out.println("the array has 5 elements so enter valid length "+e1);
		}
	
	}
}