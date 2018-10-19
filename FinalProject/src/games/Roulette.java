package games;
import java.util.Scanner;

public class Roulette {


	
	public static void roulette() {
		

	// TODO Auto-generated method stub
		System.out.println("Welcome to the Roulette Game");
		int userGuess;
		int[] numbers = new int[36];
		int computerSecret;
		int userChoice;
		int userPick;
		String red;
		String black;
		String green;
		int money = 0;
		int amount;
		int again = 0;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			
			computerSecret = (int)(Math.random() * numbers.length);
			System.out.println("How much money are you betting:");
			money = input.nextInt();
		System.out.println("Pick any number from 0 to 36:");
		userGuess = input.nextInt();
		System.out.println("1-black\2-red");
		userChoice = input.nextInt();
		if(computerSecret % 2 == 0) 
		{
			result = "Black " + computerSecret;
			if(userChoice == 1) {
				System.out.println(" you win ! " + userGuess);
			}
			else {
				System.out.println("You lose ! " + userGuess);
			}
		}
		else if(computerSecret % 2 >= 1) {
			result = "Red " + computerSecret;
			if(userChoice == 2){
				System.out.println(" you win ! " + userGuess) ;
				
			}
			else {
				System.out.println(" you lose ! "+ userGuess);
			}
		}
		
		displayMessage(result);
		
		System.out.println("Do you want to play again ?\n1- for yes\n2- for no >>");
		again = input.nextInt();
		}while(again == 1);
	}
public static void displayMessage(String result)
{
{
	System.out.println(result);
}
}

	}

		

	    
		 