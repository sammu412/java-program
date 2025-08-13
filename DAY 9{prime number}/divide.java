import java.util.*;
class div
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int count=0;
	int sum=0;
	for(int j=100;j<=200;j++)
	{
		if(j%9==0)
		{
        count++;
	    sum+=j;
		}
	}
	System.out.println("numbers"+count);
	System.out.println("numbers"+sum);

}
}