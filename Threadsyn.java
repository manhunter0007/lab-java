import java.util.*;
class display{
synchronized public void disp(int start,int upto,int increment){
for(int i=start;i<upto;i=i+increment){
System.out.println("   "+i);
}
}
}
class OneDigit extends Thread{
display d;
OneDigit(display d){
this.d=d;
}
public void run(){
d.disp(0,10,1);
}
}
class TwoDigit extends Thread{
display d;
TwoDigit(display d){
this.d=d;
}
public void run(){
d.disp(100,200,5);
}
}
public class Threadsyn{
public static void main(String args[]){
display dd=new display();
OneDigit e=new OneDigit(dd);
TwoDigit o=new TwoDigit(dd);
e.start();
o.start();
}
}
