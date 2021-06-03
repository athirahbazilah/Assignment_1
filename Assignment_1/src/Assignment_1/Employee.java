package Assignment_1;
import java.util.*;

public class Employee {
	
	String department;
	String name;
	int employeeID;
	double salary;
	
	Scanner in = new Scanner(System.in);
	
	public Employee() {
		
		System.out.println("########## Employee Information ##########");
		System.out.println();
		
		System.out.println("Enter Your Department: ");
		this.department = in.nextLine();
		System.out.println("Enter Your Name: ");
		this.name = in.nextLine();
		System.out.println("Enter Your ID: ");
		this.employeeID = in.nextInt();
		System.out.println("Enter Your Salary: RM");
		this.salary = in.nextDouble();
	}
	
	public String toString() {
		return ("\nDepartment: " + department + 
				"\nName      : " + name + 
				"\nID        : " + employeeID + 
				"\nSalary    : RM" + salary);
	}

}
