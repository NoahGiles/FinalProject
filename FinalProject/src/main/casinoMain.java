package main;

import java.util.Scanner;

import games.BlackJack;
import games.Roulette;
import games.Slots;

public class casinoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int gameChoice = 0;
		int quit = 0;
		System.out.println("                                          Welcome to the                                                         ");
		System.out.println("                                                                                                                 ");
		System.out.println("                                                                                                                 ");
		System.out.println("   0000000000000000   0000000000000000    000000000000000   0000000000000000   00000000   00000   000000000000000");
		System.out.println("   0000000000000000   0000000000000000   0000000000000000   0000000000000000   00000000   00000   000000000000000");
		System.out.println("   000                000          000   000000000000            000000        0000000000 00000   000         000");
		System.out.println("   000                0000000000000000    00000000000000         000000        0000000000000000   000         000");
		System.out.println("   000                0000000000000000       000000000000        000000        00000  000000000   000         000");
		System.out.println("   0000000000000000   000          000   0000000000000000   0000000000000000   00000   00000000   000000000000000");
		System.out.println("   0000000000000000   000          000   000000000000000    0000000000000000   00000    0000000   000000000000000");
		Wallet.money();
		
		//Game choice is given
		do {
		System.out.println("\nPlease choose a game : (1) Blackjack (2) Roulette (3) Slot Machine");
		gameChoice = input.nextInt();
		if(gameChoice == 1) {
		BlackJack.blackJackGame();
		}
		else if(gameChoice == 2) {
		Roulette.roulette();
		}
		else if(gameChoice == 3) {
		Slots.randomGen();
		}
		else
			System.out.println("Could not identify a game.");
		//Quit choice is given. If player quits, system says goodbye.
		System.out.println("\nWould you like to play again? (1) Quit (2) Play again");
		quit = input.nextInt();
	}while(gameChoice < 4 && gameChoice > 0 && quit != 1);
		
	System.out.println("Goodbye.");
	}
}
