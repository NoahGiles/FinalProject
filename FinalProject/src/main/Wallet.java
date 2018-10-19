package main;



public class Wallet {
	
	private static int money = 100;	
	int endMoney = 0;
	
	public static void money() {
	
		
		System.out.println("\nYou have " + money + " dollars.");
	}
		
			
		public static int moneyAmount(int bet, int winnings) {
		
			return money;
		
			
		}
		public static void endMoney(int bet, int winnings, int endMoney) {
			endMoney = (money - bet) + winnings;
			money = (0 + endMoney);
			System.out.println("\nYou have " + endMoney + " dollars.");

		}
	}

