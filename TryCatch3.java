import java.io.*;
class TryCatch3{
public static void main (String args[]){
int a=5,b=0,c;
try{
c=a/b;
System.out.println("Value of c is "+ c);
}
catch(Exception e){
System.out.println("Exception caught"+e);
}
}
}