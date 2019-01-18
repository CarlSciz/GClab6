import java.util.Scanner;
import java.util.Random;
public class GClab6 {

	public static void main(String[] args) {
		// the string is used to store data from the user.
		// the first int is  used to store the data from user on die sides.
		// the next int is used to help store input and begin the roll sequence and/or quit. 
		//String name;
		int userInput;
		int userInput2;
		// we must make a scanner to help input the data we need from the user. 
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		
		// prompt the user with a greeting then start the program by asking the user for input.
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();
		System.out.println("How many sides should each die have?");
		userInput = scnr.nextLine(); //Takes down the information from the user input.
		
		System.out.println("Press either 1 to roll. Or 0 to stop playing. ");
		
		userInput2 = scnr.nextInt(); //scans for user input for second int
		
		do { 
			if(userInput2 == 1) { 
				
				System.out.println(generateRandomDieRoll(userInput));
				System.out.println(generateRandomDieRoll(userInput));
			} 

		System.out.println("Roll Again?"); //prompts user to roll again
		System.out.println("Press 1 or press 0 to stop.");
		userInput2 = scnr.nextInt(); 
		} while(userInput2 == 1); 
									
			System.out.println("Goodbye!");
		
}
		
	private static int generateRandomDieRoll(int dieSides) {
	
	Random rand = new Random();   
	int rollValue = rand.nextInt((dieSides +1)); 
	return rollValue; 
	}

}
		
	
	


	




