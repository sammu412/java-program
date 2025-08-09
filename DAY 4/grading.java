import java.lang.*;
import java.util.*;
class grading
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter tamil mark:");
int t=sc.nextInt();
if(t<25)
{
System.out.println("grade is F");
}
else if(t>=25 && t<45)
{
System.out.println("grade is E");
}
else if(t>=45 && t<50)
{
System.out.println("grade is D");
}
else if(t>=50 && t<60)
{
System.out.println("grade is C");
}
else if(t>=60 && t<80)
{
System.out.println("grade is B");
}
else 
{
System.out.println("grade is A");
}
}
}