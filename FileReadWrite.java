import java.io.*;
class FileReadWrite{
public static void main(String argrs[])throws IOException{
File infile=new File("InputFile.txt");
File outfile=new File("OutputFile.txt");
FileReader inp=null;
FileWriter oup=null;
inp=new FileReader(infile);
oup=new FileWriter(outfile);
int ch;
System.out.println("The contents of the input file are:");
System.out.println("");
while((ch=inp.read())!=-1){
System.out.print((char)ch);
oup.write(ch);
}
System.out.println("");
System.out.println("The contents ofinput file are copied to the output file!!!");
System.out.println("");
inp.close();
oup.close();
}
}
