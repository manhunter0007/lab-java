import java.util.*;
class StringTokenizerExample{
public static void main(String args[]){
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter integers:");
String s=sc.nextLine();
StringTokenizer st=new StringTokenizer(s," ");
System.out.println("Integers are: \n");
while(st.hasMoreTokens()){
String temp=st.nextToken();
int n=Integer.parseInt(temp);
System.out.println(n);
sum=sum+n;
}
System.out.println("Sum="+sum);
sc.close();
}
}
