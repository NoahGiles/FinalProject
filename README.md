
# Casino Games

# Table of Contents
- Our Goal
- Our Games
- Instructions for games


# Our Goal
- Our goal was to create a program that had 3 games and acted like a casino. There is a wallet class that keeps track of your money.

# Our Games
- BlackJack
- Roulette
- Slot Machine

# Instructions for games

Our casino-based game should function like so:

In the beginning, you have 100 dollars and get a choice between playing three games : Blackjack (1), Roulette (2), and Slots (3).
After you choose a game, you can choose how much to bet on said game. These games then function as follows :

Blackjack : There's a dealer and a player. The player starts out with 2 cards, the game displaying the current score on the left and card number on the right, and then gets a choice to draw a third card in hopes of reaching a score of 21. If the player exceeds 21, they lose. If the player gets below 21, the dealer draws. If the dealer gets over 21 or less than the player without exceeding 21, they lose. If the dealer gets a total higher than the player without exceeding 21, they win. The money won or lost is then displayed, followed by the amount of money currently in the Wallet class.

Roulette : The player is given a choice of what to bet on, whether it be color or number. There are 36 numbers and 2 colors. If the player chooses to bet on numbers and the bet is right, they earn 20 times the bet. If the player chooses to bet on colors and the color is right, they earn 2 times the bet. The money won or lost is then displayed, followed by the amount of money currently in the Wallet class.

Slots : After the player bets, three numbers between 1 and 7 are selected randomly. Chances for getting higher numbers get lower each time they are not selected, that being 1 (1 in 2), 2 (1 in 4), 3 (1 in 8), 4 (1 in 20), 5 (1 in 24), 6 (1 in 32), and 7 (1 in 480). If the number generator reaches 7 and is not 7, the output is 1 (on the first try), 2 (on the second try), and 3 (on the third try). With each set of 3, there is a multiplier given to the bet (A set of 1's is x10, a set of 2's is x20, a set of 3's is x50, a set of 4's is x250, a set of 5's is x2,500, a set of 6's is x5,000, and a set of 7's is x1,000,000). The money won or lost is displayed, followed by the amount of money currently in the Wallet class.

The player is then asked if they would like to play again. If they say yes, they are prompted again on which game they'd like to play, or if they say no, the program stops entirely.
=======


