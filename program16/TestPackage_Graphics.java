
import Graphics.*;
import java.util.Scanner;
public class TestPackage_Graphics
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of square:");
int s= sc.nextInt();
Square sq=new Square(s);
System.out.println("Perimeter:"+sq.perimeter());
System.out.println("Area:"+sq.area());
System.out.println("Enter the radius of circle:");
double r= sc.nextInt();
Circle ci=new Circle(r);
System.out.println("Perimeter:"+ci.perimeter());
System.out.println("Area:"+ci.area());
System.out.println("Enter the 3 sides of triangle:");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
Triangle tr=new Triangle(a,b,c);
System.out.println("Perimeter:"+tr.perimeter());
System.out.println("Area:"+tr.area());
System.out.println("Enter the length and breadth of rectangle:");
int l= sc.nextInt();
int w= sc.nextInt();
Rectangle rec=new Rectangle(l,w);
System.out.println("Perimeter:"+rec.perimeter());
System.out.println("Area:"+rec.area());
}
}
