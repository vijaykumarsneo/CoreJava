package Practice;

import java.io.*;  
class Parent3{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
public class TestExceptionChild4 extends Parent3{  
  void msg()throws ArithmeticException{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent3 p=new TestExceptionChild4();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}
