package games;
import java.util.Scanner;

import main.Wallet;

public class Roulette {


	
	public static void roulette() {
		

	// TODO Auto-generated method stub
		int numberChoice = 0;
		int[] numbers = new int[36];
		int computerSecret;
		int colorChoice = 0;
		int userChoice = 0;
		int money = 0;
		int amount;
		int again = 0;
		int bet = 0;
		int winnings = 0;
		int endMoney = 0;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			
			computerSecret = (int)(Math.random() * numbers.length + 1);
			System.out.println("Please enter a bet >> ");
			bet = input.nextInt();
			Wallet.moneyAmount(bet, winnings);
			if (bet > Wallet.moneyAmount(bet, winnings)) {
			System.out.println("Insufficient funds.");
			}
			else if (bet <= Wallet.moneyAmount(bet, winnings)) {
			System.out.println("Do you want to guess a number or a color? (1) Number (2) Color");
			userChoice = input.nextInt();
			if(userChoice == 1) {
		System.out.println("Pick any number from 1 to 36 >> ");
		numberChoice = input.nextInt();
		
		if(numberChoice == computerSecret) {
			result = "" + computerSecret;
			System.out.println("You win! It was " + computerSecret);
		}
			else if(numberChoice != computerSecret) {
				result = "" + computerSecret;
				System.out.println("You lost! It was " + computerSecret);
			}
				else if(numberChoice > 36) {
					System.out.println("Invalid number entered");
			}
			}
			else if(userChoice == 2) {
				System.out.println("(1) Black (2) Red");
				colorChoice = input.nextInt();
				
				if(colorChoice == 1) {
		
					result = "black";
						System.out.println("You win! It was " + result + "!");	
					
					}
				}
				else if(computerSecret % 2 == 0) {
					result = "red";
					System.out.println("You lose! It was " + result + "!");
					
				}
	
	
	
				if(colorChoice == 2) {
					if(computerSecret % 2 == 0) {
						result = "red";
					
					System.out.println("You win! It was " + result + "!") ;
				}
				else if(computerSecret % 2 != 0) {
					result = "black";
					System.out.println("You lose! It was " + result + "!");
				}
			
			}
			
			
		
		//Code checks for the number choice twice for incorrect or correct, and the color choice 4 times for even, odd, black, and red.
		if(numberChoice == computerSecret) {
			winnings = (bet * 2);
			System.out.println("\nYou won " + winnings + " dollars.");
		}
		else if(colorChoice == 1 && computerSecret % 2 != 0) {
			winnings = (bet * 20);
			System.out.println("\nYou won " + winnings + " dollars.");
		}
		else if(colorChoice == 2 && computerSecret % 2 == 0) {
			winnings = (bet * 2);
			System.out.println("\nYou won " + winnings + " dollars.");
		}
		else if(numberChoice != computerSecret) {
			System.out.println("\nYou lost " + bet + " dollars.");
		}
		else if(colorChoice == 1 && computerSecret % 2 == 0) {
			System.out.println("\nYou won " + winnings + " dollars.");
		}
		else if(colorChoice == 2 && computerSecret % 2 != 0) {
				System.out.println("\nYou won " + winnings + " dollars.");
				
			}
				System.out.println("You have " + endMoney);
				Wallet.endMoney(bet, winnings, endMoney);
				bet = 0;
			}
			
			
		}while (userChoice != 1 || userChoice != 2 && bet <= Wallet.moneyAmount(bet, winnings));
	}
}


		

	    
		 