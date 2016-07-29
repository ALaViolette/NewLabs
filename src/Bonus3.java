//Tommy and Jenna

import java.util.Scanner;

public class Bonus3 {
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		System.out.println("Im thinking of a number between 1 and 100.");
		System.out.println("Try to guess it");
		
		int max = 10;
		int min = 1;
		
		
		int randomNumber = (int) (Math.random()*max) + min;
		int guess = 1;
		
		
		while (guess >= 1 && guess<= 100){
			System.out.println("Take a guess");
			guess = scan1.nextInt();
			
			if (guess > randomNumber ) {
				System.out.println("Way too high");
			}
			//|| guess < randomNumber - 10
			
			else if (guess < randomNumber) {
				System.out.println("Way too low");
				
			}
			
			else if (guess == randomNumber) {
				System.out.println("You got it!");
			}
			
			
			
			else { System.out.println("guess again");
				
			}

	}
	}
	}
