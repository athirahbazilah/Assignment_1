package Assignment_1;
import java.util.*;

public class Finance {
	
	double employeeSalary;
	double utilityFee;
	double advertisementFee;
	double prize;
	int employeeQuantity;
	int participantQuantity;
	double registrationFee;
	
	Scanner in = new Scanner(System.in);
	
	public Finance() {	//constructor with no argument
		
		System.out.println("Enter Employee Salary: RM");
		employeeSalary = in.nextDouble();
		System.out.println("Enter Utility Fee: RM");
		utilityFee = in.nextDouble();
		System.out.println("Enter Advertisement Fee: RM");
		advertisementFee = in.nextDouble();
		System.out.println("Enter Prize: RM");
		prize = in.nextDouble();
		System.out.println("Enter Employee Quantity: ");
		employeeQuantity = in.nextInt();
		System.out.println("Enter Participant Quantity: ");
		participantQuantity = in.nextInt();
		System.out.println("Enter Registration Fee: RM");
		registrationFee = in.nextDouble();
		
	}
	
	public double totalSalary() {
		return this.employeeSalary * this.employeeQuantity;
	}
	
	public double totalBudget() {
		return (this.utilityFee + this.prize + this.employeeQuantity) * (this.employeeSalary + this.advertisementFee);
	}
	
	public double totalIncome() {
		return this.participantQuantity * this.registrationFee;
	}
	
	public double calcNetProfit() {
		return this.totalIncome() - this.totalBudget();
	}
	
	public String toString() {
		return ("\nUtility Fee         : RM" + this.utilityFee + 
				"\nAdvertisement Fee   : RM" + this.advertisementFee + 
				"\nPrize               : RM" + this.prize + 
				"\nEmployee Quantity   : " + this.employeeQuantity + 
				"\nParticipant Quantity: " + this.participantQuantity + 
				"\nRegistration Fee    : RM" + this.registrationFee + 
				"\nTotal Salary        : RM" + this.totalSalary() + 
				"\nTotal Budget        : RM" + this.totalBudget() + 
				"\nTotal Income        : RM" + this.totalIncome() + 
				"\nTotal Net Profit    : RM" + this.calcNetProfit());
	}
	

}
