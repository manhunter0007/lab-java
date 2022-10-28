import java.util.*;
class Prime{
public static void main(String args[]){
int temp,num,flag=1;
System.out.println("enter number");
Scanner s=new Scanner(System.in);
num=s.nextInt();
if(num==0||num==1)
System.out.println(num+"is neither Prime nor Composite number");
else{
for(int i=2;i<=num/2;i++){
temp=num%i;
if(temp==0){
flag=0;break;
}
}
if(flag==1)
System.out.println(num+"is a Prime number");
else
System.out.println(num+"is not a Prime number");
}
}
}

