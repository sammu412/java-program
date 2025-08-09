import java.lang.*;
import java.util.*;
class salary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter employ name:");
String name=sc.nextLine();
System.out.println("enter your fixed salary:");
int fix=sc.nextInt();
System.out.println("number of working days:");
int wdays=sc.nextInt();
System.out.println("enter number of present days:");
int pdays=sc.nextInt();
System.out.println("enter your incentive %:");
int i=sc.nextInt();
double day=fix/wdays;
double month=day*pdays;
double inc=fix*i/100;
double sal=month+inc;

System.out.println("Name of the employee:"+name);
System.out.println("fixed salary is:"+fix);
System.out.println("working days:"+wdays);
System.out.println("present days:"+pdays);
System.out.println("month salary:"+month);
System.out.println("incentive amount:"+inc);
System.out.println("salary amount:"+sal);

}
}