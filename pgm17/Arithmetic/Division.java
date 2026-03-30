package Arithmetic;
public class Division implements Arithmeticdiv {
int x, y;
public Division(int a, int b) {
x = a;
y = b;
}
public double divide() {
if (y == 0) {
System.out.println("Error: Division by zero!");
return 0;
}
return (double) x / y;
}
}
