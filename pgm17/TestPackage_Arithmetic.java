import Arithmetic.*;
import java.util.Scanner;
public class TestPackage_Arithmetic {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two numbers to add");
int x = sc.nextInt();
int y = sc.nextInt();
Addition ad = new Addition(x, y);
System.out.println("Enter the two numbers to subtract:");
int p = sc.nextInt();
int q = sc.nextInt();
Subtraction s = new Subtraction(p, q);
System.out.println("Difference: " + s.subtract());
System.out.println("Enter two numbers to multiply:");
int m = sc.nextInt();
int n = sc.nextInt();
Multiplication mul = new Multiplication(m, n);
System.out.println("Product: " + mul.multiply());
System.out.println("Enter two numbers to divide:");
int d1 = sc.nextInt();
int d2 = sc.nextInt();
Division div = new Division(d1, d2);
System.out.println("Quotient: " + div.divide());
}
}
