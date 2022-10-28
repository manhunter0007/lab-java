import java.util.*;
class Palindrome{
public static void main(String args[]){
Scanner S=new Scanner(System.in);
String a,rev="";
int l;
System.out.println("enter string:");
a=S.nextLine();
l=a.length();
for(int i=l-1;i>=0;i--)
rev=rev+a.charAt(i);
if(a.equals(rev))
System.out.println(a+" is a palindrome");
else
System.out.println(a+" is not a palindrome");
}
}
