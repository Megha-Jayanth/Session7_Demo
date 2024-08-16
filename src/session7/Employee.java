package session7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {

	 @Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", dept_ID=" + dept_ID + ", dept_Name="
				+ dept_Name + "]";
	}

	private int emp_Id;
	 String emp_Name;
	 int dept_ID;
	 String dept_Name;
	
	/**
	 */
	public Employee(int emp_Id,String emp_Name,int dept_ID,String dept_Name ) {
		
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.dept_ID = dept_ID;
		this.dept_Name = dept_Name;
	}
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public void displayEmployee()
	{
		System.out.println("Employee ID \t"+emp_Id);
		System.out.println("Employee Name \t"+emp_Name);
		System.out.println("Department ID \t"+dept_ID);
		System.out.println("Department Name \t"+dept_Name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
	      
	       emp.displayEmployee();
	       System.out.println(emp);
       
       try(Scanner scanner=new Scanner(System.in))
       {
    	   System.out.println("Enter Employee ID:");
    	   int emp_Id=scanner.nextInt();
    	   System.out.println("Enter Employee Name:");
    	   String emp_Name=scanner.next();
    	   System.out.println("Enter Department ID:");
    	   int dept_ID=scanner.nextInt();
    	   System.out.println("Enter Department NAme:");
    	   String dept_Name=scanner.next();
    	   emp.displayEmployee();
	       System.out.println(emp);
       }
       catch(InputMismatchException e)
       {
    	   System.err.println("Enter Correct Format");
       }
       
       
	}

}
