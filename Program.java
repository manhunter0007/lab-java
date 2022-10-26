import java.util.*;
abstract class Shape{
abstract void numberOfSides();
}
class Triangle extends Shape{
void numberOfSides(){
System.out.println("Number of sides of Triangle is :3");
}
}
class Rectangle extends Shape{
void numberOfSides(){
System.out.println("Number of sides of Rectangle is 4");
}
}
class Hexagon extends Shape{
void numberOfSides(){
System.out.println("Number of sides of Hexagon is :6");
}
}
class Program{
public static void main(String args[]){
Shape s;
s=new Rectangle();
s.numberOfSides();
s=new Triangle();
s.numberOfSides();
s=new Hexagon();
s.numberOfSides();
}
}
