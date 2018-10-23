package games;

import java.util.Scanner;

import main.Wallet;
	
public class Slots {
	
	public static void randomGen() {
		int number = 0;
		int number2 = 0;
		int number3 = 0;
		System.out.println("How much would you like to bet?");
//		Chances should be: (1/2) + (1/4)+ (1/8) + (1/20) + (1/24) + (1/32) + (1/480) if it reaches 7 and does not equal 7, the output is 1,2,3
		for(int count = 0; count < 3; count++) {
		for(int i = 0; i < 1; i++) {
			int ran = (int) (Math.random() * 2 + 1);
			if(ran == 1) {
			if(count == 0) {
			number = 1;
			}
			else if(count == 1) {
			number2 = 1;
			}
			else if(count == 2) {
			number3 = 1;
			}
			}
			else if(ran == 2) {
				for(int j = 0; j < 1; j++) {
					int ran2 = (int) (Math.random() * 4 + 1);
						if(ran2 == 2) {
						if(count == 0) {
						number = 1;
						}
						else if(count == 1) {
						number2 = 2;
						}
						else if(count == 2) {
						number3 = 2;
						}
						}
						else if(ran2 != 2) {
							for(int k = 0; k < 1; k++) {
								int ran3 = (int) (Math.random() * 8 + 1);
									if(ran3 == 3) {
										if(count == 0) {
										number = 3;
										}
										else if(count == 1) {
										number2 = 3;
										}
										else if(count == 2) {
										number3 = 3;
										}
										}
									else if(ran3 != 3) {
										for(int l = 0; l < 1; l++) {
											int ran4 = (int) (Math.random() * 20 + 1);
												if(ran4 == 4) {
													if(count == 0) {
													number = 4;
													}
													else if(count == 1) {
													number2 = 4;
													}
													else if(count == 2) {
													number3 = 4;
													}
													}
					
													else if(ran4 != 4) {
														for(int m = 0; m < 1; m++) {
															int ran5 = (int) (Math.random() * 24 + 1);
																if(ran5 == 5) {
																	if(count == 0) {
																	number = 5;
																	}
																	else if(count == 1) {
																	number2 = 5;
																	}
																	else if(count == 2) {
																	number3 = 5;
																	}
																	}
																	else if(ran5 != 5) {
																		for(int n = 0; n < 1; n++) {
																			int ran6 = (int) (Math.random() * 32 + 1);
																				if(ran6 == 6) {
																					if(count == 0) {
																					number = 6;
																					}
																					else if(count == 1) {
																					number2 = 6;
																					}
																					else if(count == 2) {
																					number3 = 6;
																					}
																					}
																				else if(ran6 != 6) {
																					
																						for(int o = 0; o < 1; o++) {
																							int ran7 = (int) (Math.random() * 480 + 1);
																								if(ran7 == 7) {
																									if(count == 0) {
																									number = 7;
																									}
																									else if(count == 1) {
																									number2 = 7;
																									}
																									else if(count == 2) {
																									number3 = 7;
																									}
																									}
																									else if(ran7 != 7) {
																										if(count == 0) {
																											number = 1;
																											}
																											else if(count == 1) {
																											number2 = 2;
																											}
																											else if(count == 2) {
																											number3 =  3;
																											}
																										}
																									}
																								}
																							}
																						}			
																					}	
																				}	
																			}
																		}		
																	}
																}
															}
														}
													}
												}
		slots(number, number2, number3);
	}
		
	
	public static void slots(int number, int number2, int number3) {
		int bet = 0;
		int winnings = 0;
		int runCount = 0;
		int endMoney = 100;
		do {
		System.out.println("Please enter a bet >> ");
		Scanner input = new Scanner(System.in);
		bet = input.nextInt();
		//The game looks for matching numbers and changes the winnings accordingly.
			if(number == number2 && number2 == number3 && number == number3) {
			if(number == 1 && number2 == 1 && number == 1) {
				winnings = bet * 10;
			}
			else if(number == 2 && number2 == 2 && number3 == 2) {
				winnings = bet * 20;
			}
			else if(number == 3 && number2 == 3 && number3 == 3) {
				winnings = bet * 50;
			}
			else if(number == 4 && number2 == 4 && number3 == 4) {
				winnings = bet * 250;
			}
			else if(number == 5 && number2 == 5 && number3 == 5) {
				winnings = bet * 2500;
			}
			else if(number == 6 && number2 == 6 && number3 == 6) {
				winnings = bet * 5000;
			}
			else if(number == 7 && number2 == 7 && number3 == 7) {
				winnings = bet * 1000000;
			}
			else if(number != number2) {
			}
		}
		
			Wallet.moneyAmount(bet, winnings);
		if (bet > Wallet.moneyAmount(bet, winnings)) {
		System.out.println("Insufficient funds.");
		}
		//The slot machine is shown, as well as the legend for sets of numbers.
		else if(bet <= Wallet.moneyAmount(bet, winnings)) {
		while(bet <= Wallet.moneyAmount(bet, winnings) && runCount == 0) {
		for(runCount = 0; runCount < 1; runCount++) {
		System.out.println("\n              000000000000000000000     0000000000000000000000000000000000000");
		System.out.println("             000000000000000000000 0    0      3 of the following:          0");
		System.out.println("           000000000000000000000   0    0 1 = 10                5 = 2500    0");
		System.out.println("         000000000000000000000     0    0 2 = 20                6 = 5000    0");
		System.out.println("       000000000000000000000       0    0 3 = 50                7 = 1000000 0");
		System.out.println("       0                   0       0    0 4 = 250                           0");
		System.out.println("       0                   0       0    0                                   0");
		System.out.println("       0    " + number +"    "+ number2 + "    " + number3 + "    0       0    0000000000000000000000000000000000000");
		System.out.println("       0                   0       0 ");
		System.out.println("       0                   0       0 ");
		System.out.println("      000000000000000000000        0 ");
		System.out.println("     0 0 0 0 0 0 0 0 0 0 0         0 ");
		System.out.println("    0 0 0 0 0 0 0 0 0 0 0          0 ");
		System.out.println("    00000000000000000000           0 ");
		System.out.println("    0000 S L O T S  0000         0   ");
		System.out.println("    00000000000000000000       0     ");
		System.out.println("    00000000000000000000     0       ");
		System.out.println("    000000000000000000000000         ");
		//The money won or lost is displayed, and the player is given the amount of money stored in the wallet.
		if(number == number2 && number == number3) {
		System.out.println("\nYou won " + winnings + " dollars.");
		}
		else if(number != number2 || number2 != number3 || number != number3) {
		System.out.println("\nYou lost " + bet + " dollars.");	
		}
		Wallet.endMoney(bet, winnings, endMoney);
		bet = 0;
		
		}
		}	
		}
		}while (bet > Wallet.moneyAmount(bet, winnings));
	}
}

