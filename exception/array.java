import java.lang.*;
import java.util.*;
import java.util.InputMismatchException.*;
public class array
{
	public static void main(String args[])
	{
		int[] array={2,3,4,5,6};
			try{
			System.out.println(array[3]);
			System.out.println(array[10]);
			
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