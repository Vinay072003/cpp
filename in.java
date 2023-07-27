import java.util.Scanner;
class Player{
int age,rank;
String name;
Player(String n,int a,int r){
age=a;
name=n;
rank=r;
}
 void disp(){
System.out.println("PLayer name is "+name);
System.out.println("PLayer name is "+age);
System.out.println("PLayer name is "+rank);
} 
}
 class ckp extends Player{
String game,role;
ckp(String g,String ro,String n,int a,int r){
super(n,a,r);
game=g;
role=ro;
}
public void disp(){
super.disp();
System.out.println("PLayer gmae is "+game);
System.out.println("PLayer role is "+role+"/n");
}}
class ft extends Player{
String game,role;
ft(String g,String ro,String n,int a,int r){
super(n,a,r);
game=g;
role=ro;
}
public void disp(){
super.disp();
System.out.println("PLayer gmae is "+game);
System.out.println("PLayer role is "+role+"/n");

}
}
class hokp extends Player{
String game,role;
hokp(String g,String ro,String n,int a,int r){
super(n,a,r);
role=ro;
game=g;

}
public void disp(){
super.disp();
System.out.println("The game is "+game);
System.out.println("The role is "+role);

}}
public class in{
public static void main(String args[]){
hokp p1=new hokp("hockey","player","vinay",19,1);
ft p2=new ft("fotball","player","pawan",19,1);
ckp p3=new ckp("cricket","player","vinay",19,1);
p1.disp();
p2.disp();
p3.disp();
}
}