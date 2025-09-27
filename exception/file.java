import java.lang.*;
import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class file
{
	public static void main(String args[])
	{
			try
			{
		File f=new File("C:\\sammunja\\outputs.txt");
		FileWriter fs=new FileWriter(f);
		
	     fs.write("sammu");
		 fs.close();
		if(f.mkdir())
		{
			System.out.println("folder is created");
		}
		else
		{
		System.out.println("folder is not created");	
		}
			}
	 catch(Exception e)
	{
		System.out.println("folder is not created");
	}
	
	}
}