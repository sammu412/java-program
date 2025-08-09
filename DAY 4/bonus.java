import java .lang.*;
import java.util.*;
class bonus
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter salary:");
double s=sc.nextInt();
System.out.println("enter year of service:");
int y=sc.nextInt();
double b=(s*5)/100;
if(y>=5)
{
System.out.println("your bonus is:"+b);
System.out.println("your bonus salary is:"+(s+b));
}
else
{
System.out.println("your salary is:"+s);
}
}
}