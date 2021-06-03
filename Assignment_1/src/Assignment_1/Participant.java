package Assignment_1;
import java.util.*;

public class Participant {
	
	String name;
	String teamName;
	String gender;
	int age;
	int numOfParticipant;
	
	Scanner in = new Scanner(System.in);
	
	public Participant() {
		
		System.out.println("########## Participants Info ##########");
		System.out.println();
		
		System.out.println("Enter Name Of Participant: ");
		this.name = in.nextLine();
		System.out.println("Enter Your Team Name: ");
		this.teamName = in.nextLine();
		System.out.println("Enter Your Gender: ");
		this.gender = in.next();
		System.out.println("Enter Your Age: ");
		this.age = in.nextInt();
		System.out.println("Enter Number Of Participants: ");
		this.numOfParticipant = in.nextInt();
	}
	
	public String toString() {
		return ("\nName Of Participant   : " + name + 
				"\nTeam Name             : " + teamName + 
				"\nGender                : " + gender + 
				"\nAge                   : " + age + 
				"\nNumber Of Participants: " + numOfParticipant);
	}

}
