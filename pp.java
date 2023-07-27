interface vk{

void name();
}

class t implements vk{
String g;
t(String f){
g=f;
}

public void name(){
System.out.println("the name is "+g);
}
}

public class tt{
public static void main(String args[]){
t w=new t("vinay");
w.name();
}
}