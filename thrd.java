import java.util.Scanner;

import java.io.*;
class thrd extends Thread{  
  public void run()
  {
  
  }  
 public static void main(String args[]){  
  thrd t1=new thrd ();  
  thrd t2=new thrd ();
 
  Scanner p1 = new Scanner(System.in);
 
  System.out.print("Enter name:");

  String name=p1.nextLine();

  System.out.print("Enter no:");

  String no=p1.nextLine(); 
 
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
    
  
  t1.start();  
  t2.start();  

  Scanner p = new Scanner(System.in);
    	  System.out.print("Update no:");
    	
  String num=p.nextLine();  

  t1.setName(num);
  System.out.println("Name:"+name);
  
  System.out.println("After changing number of participant:"+t1.getName());  
 }  
} 
