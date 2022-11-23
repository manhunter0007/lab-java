import java.util.*;
public class DLL
{
Node head;
class Node
{
int data;
Node left;
Node right;
Node(int data)
{
this.data=data;
}
}
public void Insert(int data)
{
Node obj=new Node(data);
Node last=head; obj.right=null;
if(head==null)
{
head=obj;
obj.left=null;
}
else
{
while(last.right!=null)
{
last=last.right;
}
last.right=obj; obj.left=last;
}
}
public void Delete(int data)
{
Node last=head;
if(head==null)
{
System.out.println("List is empty.Deletion not possible.");
}
else if(head.data==data)
{
head=head.right;
}
else
{
while(last.data!=data)
{
last=last.right;
}
if(last.right==null)
{
last.left.right=null;
}
else
{
last.right.left=last.left;
last.left.right=last.right;
}
}
}
public void Display()
{
Node current=head;
if(head==null)
{
System.out.println("List is empty");
}
else
{
System.out.print("Contents of doubly linked list is:-");
while(current!=null)
{
System.out.print(current.data+" ");
current=current.right;
}
System.out.println();
}
}
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
DLL obj1=new DLL();
int val;
System.out.println("Implementation of Doubly Linked List\n");
do
{
System.out.println("Doubly Linked List-MENU");
System.out.println("1--Insert an element");
System.out.println("2--Delete an element");
System.out.println("3--Display contents of list");
System.out.println("4--Exit");
System.out.println("Enter your choice:-");
val=reader.nextInt();
switch(val)
{
case 1:
{
System.out.print("Enter element to be deleted:-");
int data=reader.nextInt();
obj1.Insert(data);
break;
}
case 2:
{
System.out.print("Enter element to be deleted:-");
int data=reader.nextInt();
obj1.Delete(data);
break;
}
case 3:
{
obj1.Display();
break;
}
case 4:
{
System.out.println("Exiting the menu");
break;
}
default:
{
System.out.println("Error in entered input.Better luck next time");
break;
}
}
}while(val!=4);
}
}
