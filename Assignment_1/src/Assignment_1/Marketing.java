package Assignment_1;
import java.util.*;
public class Marketing {
	
	double prize;
	String day;
	double registrationFee;
	
	Scanner in = new Scanner(System.in);
	
	public Marketing() {
		
		System.out.println("^^^^^^^^^^ MARKETING ^^^^^^^^^^");
		System.out.println();
		
		System.out.println("Enter Day of Your Registration: ");
		day = in.nextLine();
		System.out.println("Enter Total Prize: RM");
		prize = in.nextDouble();
		System.out.println("Enter Registration Fee: RM");
		registrationFee = in.nextDouble();
		
	}
	
	public Marketing(double p, String d, double rF) {	//constructor with 3 argument
		
		double prize = p;
		String day = d;
		double registrationFee = rF;
		
	}
	
	public double getPrize() {
		return this.prize;
	}
	
	public String getDay() {
		return this.day;
	}
	
	public double getRegistrationFee() {
		return this.registrationFee;
	}
	
	public double totalPrice() {	//constructor with no argument
		return this.registrationFee;
	}
	
	public double totalPrice(double disc) {		//constructor with one argument
		return this.totalPrice() * (1 - disc);
	}
	public double totalPrice(String d, double disc) {	//constructor with 2 arguments
		
		if (d == "Friday" || d == "Saturday") {
			return this.totalPrice(0.10);
		}
		else {
			return this.totalPrice();
		}
	}
	
	public void printAdvertisement() {
		
		System.out.println("%%%%%%%%%% ADVERTISEMENT %%%%%%%%%%");
		System.out.println();
		
		System.out.println("We provide comfortable place for you to enjoy your futsal activities." + 
						   "\nFeel free to register at our futsal centre. You will never disappoints.");
		System.out.println("We provide a really appreciable prize for the winner at RM" + this.prize);
		System.out.println("We also privode 10% discount on the weekend. so you can enjoy you futsal activities to the fullest!");
		System.out.println("If you are interested, you can contact us +609-8594882 for more info");
	}
	
	public String toString() {
		return ("Prize           : RM" + this.prize + 
				"\nDay             : " + this.day + 
				"\nRegistration Fee: RM" + this.registrationFee + 
				"\nLowest Price    : RM" + this.totalPrice("Saturday", 0.10) + " especially on Friday and Saturday");
	}

}
