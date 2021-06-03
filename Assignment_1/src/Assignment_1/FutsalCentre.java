package Assignment_1;

public class FutsalCentre {
	
	String centreName;
	String adress;
	String contact;
	
	public FutsalCentre() {
		
		System.out.println("Welcome to AB Futsal Centre");
		System.out.println();
		System.out.println("********** AB FUTSAL CENTRE INFO **********");
		
		centreName = "AB Futsal Centre";
		adress = "AB Futsal Centre, Taman Cukai Utama, 24000 Kemaman, Terengganu";
		contact = "+609-8594882";
		
	}
	
	public String getCentreName() {
		return this.centreName;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public String getContact() {
		return this.contact;
	}
	
	public String toString() {
		return ("\nCentre Name: " + centreName +
				"\nAdress     : " + adress + 
				"\nContact    : " + contact);
	}

}
