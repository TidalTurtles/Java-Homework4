
import java.util.Scanner;

public class HoltNoahAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				/*Noah Holt
				 * CS1150 Principles of computer science
				 * m/w section
				 * Due 24 feb
				 * Assignment 4
				 * This assignment is to create a license plate generator for a three state area
				 *  based off which state the user chooses and which type of license plate they want
				 */
		Scanner user = new Scanner(System.in);
		
		//prompt user with clear directions
		System.out.println("Enter 2 character input, one for state and one for plate type:");
		System.out.println("C: Colorado		W: Wyoming		U: Utah");
		System.out.println("1: Regular plate	2: Adopt a Pet plate	3: Fire Fighter plate");
		
		String userInput = user.nextLine();
		String upperUserInput = userInput.toUpperCase();
		
		//looking at user input
		char stateInput = upperUserInput.charAt(0);
		char typeInput = upperUserInput.charAt(1);
		
		//variables for later
		String stateChoice = "";
		String typeChoice = "";
		
		
		// lets validate the users input and save variables
		if ((stateInput == 85) || (stateInput == 67) || (stateInput == 87)) {
			if (stateInput == 85){
				stateChoice = "Utah";
			} else if (stateInput == 67) {
				stateChoice = "Colorado";
			} else {
				stateChoice = "Wyoming";
			}
			
			if ((typeInput <= 51) && (typeInput >= 49)) {
				if (typeInput == 49) {
					typeChoice = "Regular Plate";
				} else if (typeInput == 50) {
					typeChoice = "Adopt a Pet Plate";
				} else {
					typeChoice = "Fire Fighter Plate";
				}
			} else {
				System.out.println("Invalid plate type, must be 1, 2, or 3");
			}
		} else {
			System.out.println("State input invalid, must be C, W, or U");
		}
		
		
		//closing scanner (almost forgot)
		user.close();
		
	}

}
