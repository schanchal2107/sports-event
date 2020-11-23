package mypack;
import java.util.*;

interface details
{
void menu();
}

class Admin implements details
{
public void menu()
{
System.out.println("*****Sports******");
System.out.println("1.Basketball");
System.out.println("2.Badminton");
System.out.println("3.Dodgeball");
System.out.println("4.Kho-Kho");
System.out.println("5.Kabaddi");
System.out.println("6.Rugby");
System.out.println("7.Softball");
System.out.println("8.Tennis");
System.out.println("9.Table Tennis");
System.out.println("10.Volleyball");     }
public void adminlogin()
{
Scanner input = new Scanner(System.in);
String u="Admin";
String p="Admin123";
String username;
String password;
System.out.println("*****Log in******");
System.out.print("Enter Username :: ");
username = input.next();
System.out.print("Enter Password :: ");
password = input.next();
if(username.equals(u) && password.equals(p)) 
System.out.println("You are logged in");
else
System.out.println("Invalid Username/Password");
}
}

class User implements details
{
public void menu()
{
System.out.println("*****Sports******");
System.out.println("1.Basketball");
System.out.println("2.Badminton");
System.out.println("3.Dodgeball");
System.out.println("4.Kho-Kho");
System.out.println("5.Kabaddi");
System.out.println("6.Rugby");
System.out.println("7.Softball");
System.out.println("8.Tennis");
System.out.println("9.Table Tennis");
System.out.println("10.Volleyball");     }
String full_name; 
int phone_no; 
String email_Id; 
String user_name;
String password;
public void registration(){
System.out.print("\n*************Enter Registration details*************\n");
Scanner sc=new Scanner(System.in);
System.out.print("Enter Full name=");
this.full_name=sc.next();
System.out.print("Enter Phone No=");
this.phone_no=sc.nextInt();
System.out.print("Enter Email_id=");
this.email_Id=sc.next();
System.out.print("Enter UserName=");
this.user_name=sc.next();
System.out.print("Enter Password=");
this.password=sc.next();
}
public void userlogin()
{
Scanner input = new Scanner(System.in);
String username;
String password;
System.out.println("*****Log in******");
System.out.print("Enter Username :: ");
username = input.next();
System.out.print("Enter Password :: ");
password = input.next();
if ( (user_name.equals(username)) && (password.equals(password)) )
System.out.println("Verified");
else
System.out.println("Invalid Username/Password");
}
}
public class inface
{
public static void main(String args[])
{
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("@		WELCOME		@");
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("[1]    Display Sports Events ");
System.out.println("[2]    Admin Login");
System.out.println("[3]    User Login");
System.out.println("[4]    Log out");
int choice;
do 
{
System.out.println("Enter the option: ");
Scanner scan = new Scanner(System.in);
choice = scan.nextInt();
switch (choice)
{
case 1:
details d1=new Admin();
d1.menu();
break;
case 2:
Admin a1=new Admin();
a1.adminlogin();
break;
case 3:
User u1=new User();
u1.registration();
u1.userlogin();
}
}while(choice !=3);
}
}