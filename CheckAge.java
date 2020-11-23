import java.util.Scanner;
import java.io.*;
class InvalidAgeException extends Exception
{
    InvalidAgeException(final String message)
 {
       System.out.println("Not for This Time");
 }
}

public class CheckAge
{
  int age;
  public static void main (String[] args)
{

    try
    {
	CheckAge obj = new CheckAge();
       		obj.run (args);
    }
    catch (Exception e)
    {
        System.out.println("Not Eligible");
    }
}

// instance variables here

public void run (String[] args) throws InvalidAgeException
{
   Scanner p = new Scanner(System.in);
   System.out.println("Age:");
   int age=p.nextInt();
   if(age<18)
  throw new InvalidAgeException("not valid");
  else
    System.out.println("Eligible");


}
}