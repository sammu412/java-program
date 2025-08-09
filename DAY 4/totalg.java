import java.lang.*;
import java.util.*;
class totalgrade
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter tamil mark:");
int t=sc.nextInt();
System.out.println("enter english mark:");
int e=sc.nextInt();
System.out.println("enter math mark:");
int m=sc.nextInt();
System.out.println("enter science mark:");
int s=sc.nextInt();
System.out.println("enter social mark:");
int sl=sc.nextInt();
double x=(t+e+m+s+sl);
System.out.println("total mark:"+x);
if(x<=500 && x>450)
{
System.out.println("grade is A");
}
else if(x<=450 && x>400)
{
System.out.println("grade is B");
}
else if(x<=400 && x>350)
{
System.out.println("grade is C");
}
else if(x<=350 && x>300)
{
System.out.println("grade is D");
}
else if(x<=300 && x>250)
{
System.out.println("grade is E");
}
else 
{
System.out.println("Fail");
}
}
}