import java.util.Scanner;
import java.util.Random;

public class DiceRollingGame {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		int diceSides = 0;
		Random rollingDice = new Random();
		int diceOne = 0;
		int diceTwo = 0;

		diceSides(scan1);

		while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {

			diceRoll(rollingDice);

			System.out.println("Would you like to roll again? yes or no");
			choice = scan1.nextLine();

		}
		// System.out.println("Would you if to play with another pair of dice");
		// choice = scan1.nextLine();

		System.out.println("Thank you for playing!");
	}

	public static void diceSides(Scanner scan1) {
		int diceSides;
		System.out.println("How many sides are on a pair of dice");
		diceSides = scan1.nextInt();
		scan1.nextLine();
		System.out.println("You entered " + diceSides + " sides, we will now roll both dice");
	}

	public static void diceRoll(Random rollingDice) {
		int diceOne;
		int diceTwo;
		diceOne = rollingDice.nextInt(6);
		diceTwo = rollingDice.nextInt(6);

		System.out.println("Your rolled " + diceOne + " and " + diceTwo);

	}

}
