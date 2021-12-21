import java.util.*;
class OverLoading
{
public void area(int x,int y)
{
System.out.println("area of rectangle is "+(x*y));
}
public void area(int m)
{
	System.out.println("area of square is "+(m*m));
}
public void area(float t)
{
	System.out.println("area of circle is "+(3.14*t*t));
}
public static void main(String [] asa)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter two length and breath of rectangle");
int l=s.nextInt();
int b=s.nextInt();
OverLoading ss=new OverLoading();
ss.area(l,b);
System.out.println("Enter side of square");
int a=s.nextInt();
ss.area(a);
System.out.println("Enter radius of circle");
float r=s.nextFloat();
ss.area(r);
}
}
