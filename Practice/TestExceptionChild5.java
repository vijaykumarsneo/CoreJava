package Practice;

import java.io.*;  
class Parent4{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
public class TestExceptionChild5 extends Parent4{  
  void msg(){System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent4 p=new TestExceptionChild5();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}