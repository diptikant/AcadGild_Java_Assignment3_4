package Java_Assignment34;
/*
 * This class will help to master the Methods, Constructor, Inheritance and Encapsulation
 * 
 */

import java.util.*;

public class Java_Assignment3_4 
{

	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);  // Scanner object to take the input from the user.
		StudentResultProcessing ob=new StudentResultProcessing(); // initializing the StudentResultProcessing object
		
		System.out.println("Enter Student Name: ");
		ob.setName(sc.next()); //Accepting the value for Student Name
		System.out.println("Enter Student Class: ");
		ob.setStClass(sc.next()); //Accepting the value for Student class
		System.out.println("Enter Student RollNo: ");
		ob.setRollNo(sc.nextInt()); //Accepting the value for Student Roll number
		System.out.println("Enter Student Phone No: ");
		ob.setPhno(sc.nextLong()); //Accepting the value for Student Phone number
		
		ob.dispResult(); // For printing the result of the student
		sc.close(); //closing the scanner object
	}
	
}
class Student // Base Class for student
{
	//declaring all private member data 
	private String sname;
	private String stclass;
	private int rollno;
	private long phno;
	private float sub1,sub2,sub3;
	private float per;
	public Scanner sc;
	public Student() // Constructor of student class
	{
		 sc=new Scanner(System.in);
	}
	
	public String getName() // Getter for Name
	{
		return sname;		
	}
    public String getStClass() // Getter for Class
	{
		return stclass;
		
	}
	public int getRoll() // Getter for RollNo
	{
		return rollno;
	}
	public long getphno() // Getter for Phone number
	{
		return phno;
	}
	public void setName(String s) // Setter for Name
	{
		sname=s;
	}
	
	public void setStClass(String c) // Setter for Class
	{
		stclass=c;
	}
	public void setPhno(long p) // Setter for Phone number
	{
		phno=p;
	}
	public void setRollNo(int r) // Setter for RollNo
	{
		rollno=r;
	}
	//Method result to accept value of 3 subjects and calculating the result 
	public String   result()
	{   
		rollno=getRoll();
		System.out.println("Enter First subject marks: ");
		sub1=sc.nextFloat();  // Accepting the user input for the first subject marks
		System.out.println("Enter Second subject marks: ");
		sub2=sc.nextFloat();  // Accepting the user input for the second subject marks
		System.out.println("Enter Third subject marks: ");
		sub3=sc.nextFloat();  // Accepting the user input for the third subject marks
		per=((sub1+sub2+sub3)/300)*100;
		
		if(per>=40)
			return "Pass"; // Returning result as pass if percentage is more than 40
		else
			return "Fail";
		
		
	}
	
	
}

class StudentResultProcessing extends Student // child Class for printing the result
{ 
	String p;
	public StudentResultProcessing()
	{
		super();
	}	
	
	public void dispResult() // Method to print the result
	{
		p=result();
		System.out.println("\nResult Declaration");
		System.out.println("----------------------");
		System.out.println("Student Name: "+getName());
		System.out.println("\tClass: "+getStClass());
		System.out.println("\tRoll No: "+getRoll());
		System.out.println("\tPhone Number: "+getphno());			
		System.out.println("\tResult: " + p);	
		
	}
	
	
}
