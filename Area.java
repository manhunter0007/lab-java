import java.util.*;
public class Area{
static void area(float x){
double a = 3.14*x*x;
System.out.println("Area of circle is" +a);
}
static void area (int x, int y) {
int a = x*y;
System.out.println("Area of rectangle is " +a);
}
static void area ( float b, float h ) {
double a= 0.5*b*h;
System.out.println(" Area of triangle is " +a);
}
public static void main ( String args[]) {
int l,w;
float r;
float b,h;
int ch ;
Scanner s = new Scanner(System.in);
while (true){
System.out.println("1.circle\n2.retangle\n3.triangle");
System.out.println("Enter choice 1-3");
ch = s.nextInt();
if (ch==1){
System.out.println("Enter the radius of circle :");
r= s.nextFloat();
area(r);
}
else if (ch==2) {
System.out.println("Enter sides of rectangle:");
l=s.nextInt();
w=s.nextInt();
area(l,w);
}
else if ( ch==3){
System.out.println("Enter breadth and height of triangle");
b=s.nextInt();
h=s.nextInt();
area(b,h);
}
else{
System.out.println("Wrong choice!!");
}
}}}
 

