import java.io.*;
public class hd{
public static void main(String args[]){
String l=" ";
int chart;
try{
FileReader fc=new FileReader("D:\test\read");
FileWriter rc=new FileWriter("D:\test/wt");
while((chart=fc.read())!=-1){
l+=(char)chart;
}
rc.write(l);
System.out.println("All Done");
fc.close();
rc.close();

}
catch(Exception e){
e.printStackTrace();
}
}
}