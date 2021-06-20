import java.math.*;
class ci
{
public static void main(String[] args)
{
int p = 600000;
int t = 6;
int n = 2;
int r = 8;
int i = n * t;
double a = Math.pow(i,(1 + (r/n))) ;
double c = p * a;
System.out.println("Compound Interest  = "+c);
}
}