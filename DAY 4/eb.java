import java.lang.*;
import java.util.*;
class eb
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter customer name:");
String name=sc.next();
System.out.println("enter customer id:");
int id=sc.nextInt();
System.out.println("enter unit of electricity:");
int u=sc.nextInt();
double a=u*5;
double b=u*7.25;
if(u>=1 && u<200)
{
System.out.println("Free");
}
else if(u>=200 && u<500)
{
System.out.println("your bill is:"+a);
}
else if(u>=500 && u<1000)
{
System.out.println("your bill is:"+b);
}
else 
{
System.out.println("please conduct electric board");
}
}
}