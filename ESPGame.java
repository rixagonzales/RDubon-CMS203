/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: public class ESP Game contains the program for a game in where there's a list of 7 colors and the
               program has to randomly choose a color that way to user is able to play a game of guessing.
 * Due: 09/11/2023
* Platform/compiler: Eclipse
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Rixa Dubon Gonzales.
 */

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String userName;        //holds the user name 
		String userDescription; //holds the entered user description
		String dueDate;         //holds the entered due date
		String userGuess;       //holds the entered guess by the user
		String randomlyColor;   //holds the random color 
		
		int correctGuesses = 0; //holds the number of correct guesses
		int randomlyNumber;     //holds the random number chosen by the program
		 
		final String RED_COLOR = "Red";          // holds 
		final String BLUE_COLOR = "Blue";
		final String GREEN_COLOR = "Green";
		final String ORANGE_COLOR = "Orange";
		final String YELLOW_COLOR = "Yellow";
		
		// prompt the user to enter name 
		System.out.println("Enter your name: ");
			userName = scanner.nextLine();
		
		//prompt the user to enter their description
		System.out.println("Describe yourself: ");
			userDescription = scanner.nextLine(); 
		
		//prompt the user to enter the assignment due date 
		System.out.println("Due Date: ");
			dueDate = scanner.nextLine();
		
		//display title of the assignment 
		System.out.println("CMSC203 Assignment1 : Test you ESp skills!\n");
		
		
		
		//iteration to allow a total of 10 rounds starting at 1-11
		for(int i = 1; i <= 11; i++ )
		{
			//prints the number of rounds
			System.out.println("Round " + i );  
			//prints the message presenting the choice of colors to the user 
			System.out.println("\nI am thinking of a color\n" +
					           "Is it Red, Green, Blue, Orange, or yellow");
			
			//statement randomly chooses a number from 0-5 which represents the valid colors
			randomlyNumber = random.nextInt(5);
			
			 switch(randomlyNumber) {
			 case 0:
				 randomlyColor = RED_COLOR;
				 break;
			 case 1:
				 randomlyColor = GREEN_COLOR;
				 break;
			 case 2: 
				 randomlyColor = BLUE_COLOR;
				 break;
			 case 3:
				 randomlyColor = ORANGE_COLOR;
				 break;
			 case 4:
				 randomlyColor = YELLOW_COLOR;
				 break;
			 default:
				 randomlyColor = "";
			 
			 }
			 
			
			//do while loop to check for invalid input of the colors 
			do {
				//prompts the user to enter a guess
				System.out.println("Enter your guess: ");
					userGuess = scanner.nextLine();
				
					//prints invalid color message if entered input is invalid
					if(!userGuess.equalsIgnoreCase("Red") &&
					!userGuess.equalsIgnoreCase("Green") &&
					!userGuess.equalsIgnoreCase("Blue") &&
					!userGuess.equalsIgnoreCase("Orange") &&
					!userGuess.equalsIgnoreCase("Yellow"))
					{
						System.out.println("You entered incorrect color. " +
								           "Is it Red, Green, Blue, Orange, or Yellow? \n" +
					                       "Enter your guess again");
					}
			
					
			}while (!userGuess.equalsIgnoreCase("Red") &&
					!userGuess.equalsIgnoreCase("Green") &&
					!userGuess.equalsIgnoreCase("Blue")  &&
					!userGuess.equalsIgnoreCase("Orange") &&
					!userGuess.equalsIgnoreCase("Yellow"));
					 {
			
						 //increments correctGuesses when user guesses correctly
						 if(userGuess.equalsIgnoreCase(randomlyColor)) {
							 correctGuesses++;
						 }
			
			
			}
					 
			//print the random color chosen by the program 
			System.out.println("\nI was thinking of a color " + randomlyColor);
		}
		
		//print message announcing the end of the game
		System.out.println("\nGame Over");
		//print the number of correct guesses
		System.out.println("\nYou guessed " + correctGuesses + " out of the 10 colors correctly.");
		
		//print the name entered by the user
		System.out.println("Student Name: " + userName  );     
		//print the description entered by the user
		System.out.println("User Description: " + userDescription);
		//print the due date entered by the user 
		System.out.println("The due date is: " + dueDate);
		
	    scanner.close();


	}
}