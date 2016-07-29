import java.util.Scanner;
import java.util.Random;

public class WalkingDeadSurvivalGame {

	public static void main(String[] args) {
		
	//Initializing and declaring variables	
		Scanner response = new Scanner(System.in);
		Random randomNumber = new Random();
		String name = "";
		String play = "";
		int question = 1;
		String answer = "";
		int zombies = randomNumber.nextInt(3+1);
		

		System.out.println("Welcome to the Walking Dead Survival Game\n");
		System.out.println("Would you like to play the game?");
		play = response.nextLine();

		while (play.equalsIgnoreCase("yes") || play.equalsIgnoreCase("y")) {
			switch (question) {
			case 1:
				System.out.println("What is your name?");
				name = response.nextLine();
				System.out.println("Hello " + name
						+ ", the objective is to survive the game without becoming one of the infected.\n");
				question = 2;
			case 2:
				System.out.println(
						"You are out for your morning jog when you see a woman being attacked do you help? yes or no");
				answer = response.nextLine();
				if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
					System.out.println("Glad to see you have some compassion " + name);
					System.out.println(
							"You approach the two of them and yell \"Get away from her!\" as you do this the man runs off. "
									+ "You continue your run since the woman is now safe");
					
					question = 3;
				} else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
					System.out.println("Her screams will haunt you later " + name);
					question = 3;
				} else {
					System.out.println("invalid response");
					question = 2;
				}
	
			case 3:
				System.out.println(
						"You are exhausted from your run you can turn left to head home or right to head to the local store to grab a water: Enter right or left");
				answer = response.nextLine();
				if (answer.equalsIgnoreCase("left") || answer.equalsIgnoreCase("l")) {
					System.out.println("You have decided to head home, lets hope you get there saftely");
					question = 5;
				} else if (answer.equalsIgnoreCase("right") || answer.equalsIgnoreCase("r")) {
					System.out.println("You have decided to head to the store, hopefully you make it there");
					question = 6;
				} else {
					System.out.println("Invalid response");
					question = 4;}		
			case 5:
				System.out.println("test");
			case 6:
				for(int i = zombies; i > 0;i--){
					System.out.println("a zombie approaches you will you run or fight");
					answer = response.nextLine();
					if(answer.equalsIgnoreCase("run")){
						System.out.println("you are eaten");
						i=0;
						play = "no";
					}else{
						System.out.println("will you");
					
					
			}

		}
		}
		System.out.println("Goodbye!");

		response.close();

	}

}
