package Practice;

import java.io.*;  
class M2{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}