package Practice;

import java.io.*;  
class Parent2{  
  void msg()throws ArithmeticException, Exception{System.out.println("parent");}  
}  
  
public class TestExceptionChild2 extends Parent2{  
  void msg()throws Exception{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent2 p=new TestExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}