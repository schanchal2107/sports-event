package mypack;
import java.io.*; 
import java.util.Scanner;

public class strdemo
{ 
    
   
    public static void main(String[] args) 
    { 
	
	StringBuffer s=new StringBuffer();
	StringBuffer s1=new StringBuffer();
	StringBuffer s2=new StringBuffer();

	Scanner name=new Scanner(System.in);
	System.out.println("Enter a name:");
	s1.append(name.nextLine());

	Scanner email=new Scanner(System.in);
	System.out.println("Enter a email:");
	s2.append(email.nextLine());

	Scanner input=new Scanner(System.in);
	System.out.println("Enter a no:");
	s.append(input.nextLine());

	int p = s.length(); 
        int q = s.capacity(); 
         
        System.out.println("Capacity of string="+q);  
	if(p>=12)
	{
	System.out.println("Invalid number");	
	}
	else
	{
	System.out.println("Name=" +s1 );
	System.out.println("Email=" +s2 );
	System.out.println("Mobile No=" +s );
	System.out.println("Length of string=" + p);
	
	}
    } 
} 