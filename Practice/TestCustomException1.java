package Practice;

import java.io.InvalidClassException;

public class TestCustomException1{  
	  
	   static void validate(int age)throws InvalidClassException{  
	     if(age<18)  
	      throw new InvalidClassException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}