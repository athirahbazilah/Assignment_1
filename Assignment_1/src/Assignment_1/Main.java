package Assignment_1;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		FutsalCentre AB = new FutsalCentre();
		System.out.println(AB);
		System.out.println();
		
		System.out.println("Choose Your Options: ");
		System.out.println("1. Admin" + "\n2. Participant");
		System.out.println("\nEnter Your Options Number: ");
		int option = in.nextInt();
		System.out.println();
		
		if (option == 1) {
			Employee Admin = new Employee();
			System.out.println(Admin);
			System.out.println();
			
			System.out.println("$$$$$$$$$$ Check Your Finance Status $$$$$$$$$$");
			System.out.println();
			Finance Financial = new Finance();
			System.out.println(Financial);
		}
		else if (option == 2) {
			Participant Customer = new Participant();
			System.out.println(Customer);
			System.out.println();
			
			EventDescription eD = new EventDescription();
			eD.EventDetails();
			eD.printFutsalRules();
			eD.printDressCode();
			eD.printFutsalCentreRules();
			System.out.println(eD);
			System.out.println();
			
			Marketing m = new Marketing();
			System.out.println(m);
			System.out.println();
			m.printAdvertisement();
		}
		else {
			System.out.println("You Enter Invalid Number, Please Try Again!");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("********** THANK YOU FOR YOUR REGISTRATION, PLEASE COME AGAIN **********");

	}

}
