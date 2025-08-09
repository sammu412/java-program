import java.lang.*;
import java.util.*;
class area
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("eneter value a");
double a=sc.nextInt();
System.out.println("eneter value b");
double b=sc.nextInt();
System.out.println("eneter value l");
double l=sc.nextInt();
System.out.println("eneter value h");
double h=sc.nextInt();
System.out.println("eneter value r");
double r=sc.nextInt();
double j=a*a;
double k=l*b;
double m=b*h/2;
double n=((b+b)*h)/2;
double o=22/7*(r*r);
System.out.println("Area of square="+j);
System.out.println("Area of rectangle="+k);
System.out.println("Area of triangle="+m);
System.out.println("Area of trapezoid="+n);
System.out.println("Area of circle="+o);
}}