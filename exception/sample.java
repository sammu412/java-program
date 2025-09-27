import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
import java.io.FileWriter.*;
import java.FileReader.*;
import java.io.FileOutputStream.*;
public class sample
{
	public sample(String filename){
	this.filename=filename;
	}
	public void createFile(){
	try{
		File f=new File(filename);
		if(f.mkdir()){
		System.out.println("file is created"+f.getName());
		}
		else{
		System.out.println("file is not created");
		}
	}catch(Exception e)
	{
		System.out.println("file is not created"+e);
	}	
 }
}
	
	public void writeFile(String filename){
		try{
		FileWriter fw=new FileWriter(filename);
		fw.write("sammu");
		fw.close();
		System.out.println("succesfully wrote");
		}catch(exception en){
			System.out.println("file not written");
		}
	}
	public void readFile()
	{
		
	}

	public static void main(String args[])
	{
	sample ex=new sample("myfile.txt");
	int count=0;
	while(count<2)
	{
		if(count==0)
		{
			ex.createFile();
		}else if(count==1)
		{
			ex.writeFile("i have money");
		}
		count++;
	}
	
	System.out.println("thankyou");
	
	}
