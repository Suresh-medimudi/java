import java.io.*;
class TryCatch6{
public static void main(String args[]){
int a=5,b=0,c;
int arr[]=new int[5];
String str=null;
try{
c=a/b;
arr[10]=200;
System.out.println("The length of the string is" + str.length());
}
catch(NullPointerException np){
System.out.println("null pointer exception caught");
}
catch(ArithmeticException ae){
System.out.println("Arithmetic Exception caught");
}
catch(ArrayIndexOutOfBoundsException ai){
System.out.println("Arrayindexoutofbounds caught");
}
catch(Exception e){
System.out.println("Exception caught");
}
}
}