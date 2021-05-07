package dice;
import java.util.Scanner;
public class Main {
/*
 * 
 * Max Hyland, 5/2/21
 * Professor Doug Lundin
 * CSC160178
 * Final project - Dice Game: 30 or Bust!
 * 
 * Two players play to get a score of exactly 30 points.
 * In the beginning a coin is tossed to decide who goes first.
 * Once the coin is tossed and a winner is decided.
 * Two dice are rolled.
 * The player has a choice to choose one of either dice or take the total of dices.
 * If the player goes over 30 points.
 * They bust and their score goes down to 0.
 * If the player gets exactly 30 points.
 * They win and the game is over.
 * 
 */
	public static void main(String[] args) {
		//Variables that are being created for use
		boolean Turn = false;
		int sum = 0;
		boolean coin;
		
		//Creates the players' objects
		DiceGame[] players = new DiceGame[2];
		for (int x = 0; x<2; x++) {
			players[x] = new DiceGame();
		}
		//Asks what are each of the players names.
		System.out.println("Hello! What is the name of player 1: ");
		Scanner input = new Scanner(System.in);
		String Name = input.nextLine();
		players[0].setUsername(Name);
		System.out.println("Now, What is the name of player 2: ");
		Name = input.nextLine();
		players[1].setUsername(Name);
		
		//Sets the points for each of the players.
		players[0].setpoints(0);
		players[1].setpoints(0);
		
		
		
		//Creates basic intro to the game. Explains rules and decides who will get to go first.
		System.out.println("Welcome players " + players[0].getUsername() +  " and " + players[1].getUsername() + "!");
		System.out.println();
		System.out.println("The goal of this game is to accumulate a player score of exactly 30. The first player to score exactly 30 is the Winner!");
		System.out.println("You will roll a pair of dice, then you must choose the score of one of the dice or the total of the two");
		System.out.println("dice. This value is added to your player score. If your score goes over 30, your score is reset to zero.");
		System.out.println("Player turn changes after each roll of the dice. You win when you accumulate a score of exactly 30.");
		System.out.println("Type okay and press enter to start.");
		System.out.println();
		input.next();
		
		//Coin toss to selects who goes first
		int Toss = (int) (Math.random() * 2);
		System.out.println("We are going to toss a coin.\n If the coin is heads = " + players[0].getUsername() + "\n If the coin is tails = " + players[1].getUsername());
		if (Toss == 1) {
			coin = false;
			System.out.println("It's heads!\n");
		}
		else {
			coin = true;
			System.out.println("It's tails!\n");
		}
		
		//While loop until one player gets 30 points. Also decides who goes first off of coin toss.
		while (sum != 30) {
			
			for (int x = 0; x < 2; x++) {
				if (coin == true) {
					x++;
				}
				System.out.println("Alright, " + players[x].getUsername() +", it's your turn!");
				System.out.println("Your score: " + players[x].getpoints());
				
				//resets sum every time through for each player.
				sum = players[x].getpoints();
				
				int dice1 = 1 + (int) (Math.random() * 6);
				int dice2 = 1 + (int) (Math.random() * 6);
				
				//Dice rolls
				System.out.println("Dice 1: " + dice1 + "\n");
				System.out.println("Dice 2: " + dice2 + "\n");
				int Total = dice1 + dice2;
				System.out.println("Total = " + Total + "\n");
				 
				//Ask what the player wants to do.
				System.out.print("Do you wish to (1) Keep die 1, (2) Keep die 2, (3) Keep the total? (Respond with 1 or 2 or 3):");
			
				//while loop ensures that the players picks the designated number. Make sure that their is no errors.
					while (Turn != true) {
						int choice = input.nextInt();
						if (choice == 1) {
							players[x].setpoints(sum + dice1);
							sum = players[x].getpoints();
							Turn = true;
						}
						else if (choice == 2) {
							players[x].setpoints(sum + dice2);
							sum = players[x].getpoints();
							Turn = true;
					
						}
						else if (choice == 3) {
							players[x].setpoints(sum + Total);
							sum = players[x].getpoints();
							Turn = true;

						}
						else {
							System.out.print("That answer was not valid. Please put either (1) (2) (3):");
						}
						}
					//Makes results in console look better after switching turns.
					System.out.println();
					System.out.println();
					
					//Checks to see if the game requirements are met and ends the game.
					if (sum == 30) {
						System.out.println(players[x].getUsername() + " wins!");
						break;
					}
					
					//Checks to see if the players go over 30 which is a bust.
					if (sum > 30) {
						System.out.println("Bust! " + players[x].getUsername() + ", Your total points now is 0. \n");
						players[x].setpoints(0);
					}
					
					//Make sure nothing falls into a loop in the while loop or coin toss loop.
					Turn = false;
					coin = false;
			}
		}
	}
}

