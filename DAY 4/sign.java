import java.lang.*;
import java.util.*;
class sign
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
if(n>0)
{
System.out.println("number is positive");
}
else if(n<0)
{
System.out.println("number is negative");
}
else
{
System.out.println("number is zero");	
}

}
}