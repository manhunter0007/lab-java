import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ca extends JFrame implements ActionListener
{
JFrame jf;
JTextField screen;
JLabel I;
float newValue=0,newValue2;
int flag=0;
JButton plus,clear,close,minus,div,mul,equal;
JButton seven,eight,nine,four,five,six,one,two,three,zero,dot;
public Ca()
{
jf=new JFrame();
jf.setTitle("calculator");
jf.setLayout(null);
jf.setSize(600,700);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
screen=new JTextField(" ");
screen.setBounds(50,50,500,100);
jf.add(screen);
I=new JLabel("");
I.setBounds(50,20,400,30);
jf.add(I);
seven=new JButton("7");
seven.setBounds(50,200,50,50);
seven.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(seven);
eight=new JButton("8");
eight.setBounds(150,200,50,50);
eight.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(eight);
nine=new JButton("9");
nine.setBounds(250,200,50,50);
nine.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(nine);
four=new JButton("4");
four.setBounds(50,300,50,50);
four.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(four);
five=new JButton("5");
five.setBounds(150,300,50,50);
five.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(five);
six=new JButton("6");
six.setBounds(250,300,50,50);
six.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(six);
one=new JButton("1");
one.setBounds(50,400,50,50);
one.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(one);
two=new JButton("2");
two.setBounds(150,400,50,50);
two.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(two);
three=new JButton("3");
three.setBounds(250,400,50,50);
three.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(three);
zero=new JButton("0");
zero.setBounds(50,500,150,50);
zero.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(zero);
dot=new JButton(".");
dot.setBounds(250,500,50,50);
dot.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(dot);
clear=new JButton("clear");
clear.setBounds(400,200,150,50);
clear.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(clear);
plus=new JButton("+");
plus.setBounds(400,300,50,50);
plus.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(plus);
minus=new JButton("-");
minus.setBounds(500,300,50,50);
minus.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(minus);
div=new JButton("/");
div.setBounds(400,400,50,50);
div.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(div);
mul=new JButton("x");
mul.setBounds(500,400,50,50);
mul.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(mul);
equal=new JButton("=");
equal.setBounds(400,500,150,50);
equal.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(equal);
one.addActionListener(this);
two.addActionListener(this);
three.addActionListener(this);
four.addActionListener(this);
five.addActionListener(this);
six.addActionListener(this);
seven.addActionListener(this);
eight.addActionListener(this);
nine.addActionListener(this);
zero.addActionListener(this);
dot.addActionListener(this);
plus.addActionListener(this);
minus.addActionListener(this);
div.addActionListener(this);
mul.addActionListener(this);
clear.addActionListener(this);
equal.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==seven)
{
String oldText=screen.getText();
screen.setText(oldText+"7");
}
else if(e.getSource()==eight)
{
String oldText=screen.getText();
screen.setText(oldText+"8");
}
else if(e.getSource()==nine)
{
String oldText=screen.getText();
screen.setText(oldText+"9");
}
else if(e.getSource()==four)
{
String oldText=screen.getText();
screen.setText(oldText+"4");
}
else if(e.getSource()==five)
{
String oldText=screen.getText();
screen.setText(oldText+"5");
}
else if(e.getSource()==six)
{
String oldText=screen.getText();
screen.setText(oldText+"6");
}
else if(e.getSource()==one)
{
String oldText=screen.getText();
screen.setText(oldText+"1");
}
else if(e.getSource()==two)
{
String oldText=screen.getText();
screen.setText(oldText+"2");
}
else if(e.getSource()==three)
{
String oldText=screen.getText();
screen.setText(oldText+"3");
}
else if(e.getSource()==zero)
{
String oldText=screen.getText();
screen.setText(oldText+"0");
}
else if(e.getSource()==dot)
{
String oldText=screen.getText();
screen.setText(oldText+".");
}
else if(e.getSource()==plus)
{
flag=1;
newValue=Float.parseFloat(screen.getText());
screen.setText(" ");
}
else if(e.getSource()==minus)
{
flag=2;
newValue=Float.parseFloat(screen.getText());
screen.setText(" ");
}
else if(e.getSource()==div)
{
flag=3;
newValue=Float.parseFloat(screen.getText());
screen.setText(" ");
}
else if(e.getSource()==mul)
{
flag=4;
newValue=Float.parseFloat(screen.getText());
screen.setText(" ");
}
else if(e.getSource()==equal)
{
float newValue2=Float.parseFloat(screen.getText());
switch(flag)
{
case 1:screen.setText((newValue+newValue2)+"");
I.setText(newValue+"+"+newValue2+"=");
break;
case 2:screen.setText((newValue-newValue2)+"");
I.setText(newValue+"-"+newValue2+"=");
break;
case 3:screen.setText((newValue/newValue2)+"");
I.setText(newValue+"/"+newValue2+"=");
break;
case 4:screen.setText((newValue*newValue2)+"");
I.setText(newValue+"*"+newValue2+"=");
break;
 default:screen.setText("Syntax error");
 break;
 }
 }
 else if(e.getSource()==clear)
 {
 screen.setText(" ");
 I.setText(" ");
 }
 }
 /*
 else if(e.getSource()==close)
 {
 System.exit(0);
}
}*/
public static void main(String args[])
{
new Ca();
}
}
