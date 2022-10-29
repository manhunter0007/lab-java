import java.util.Scanner;
import java.util.*;
public class transpose{
public static void main(String args[]){
int i,j,row,col;
int a1[][]=new int[100][100];
Scanner mat=new Scanner(System.in);
System.out.println("ENTER NUMBER OF ROWS IN MATRIX:");
row=mat.nextInt();
System.out.println("ENTER NUMBER OF COLUMNS IN A MATRIX:");
col=mat.nextInt();
System.out.println("Enter elements in matrix:");
for(i=0;i<row;i++){
for(j=0;j<col;j++){
a1[i][j]=mat.nextInt();
}
}
System.out.println("ORIGINAL MATRIX:");
for(i=0;i<row;i++){
for(j=0;j<col;j++){
System.out.print(a1[i][j]+" ");
}
System.out.println("\n");
}
System.out.println("\nTRANSPOSE MATRIX:");
for(i=0;i<col;i++){
for(j=0;j<row;j++){
System.out.print(a1[j][i]+" ");
}
System.out.println("\n");
}
}
}


