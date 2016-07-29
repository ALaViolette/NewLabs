import java.util.Scanner;

public class pigLatinGame {

	public static void main(String[] arg) {
		Scanner scan1 = new Scanner(System.in);
		String input = ""; // using for user input
		String pigLatin = ""; //using to build word

		System.out.println("Please enter a word");
		input = scan1.nextLine();

		// reassigns the string to lowercase
		input = input.toLowerCase();
		
		
			for (int i = 0; i < input.length()-1; i++) { // loops through word letters
				char letter = input.charAt(i);// addresses each letter
				char firstV = input.charAt(0);//only the first letter
				
				if (firstV== 'a' || firstV == 'e' || firstV == 'i' || firstV == 'o' || firstV == 'u') {
					System.out.println(input + " is " + input + "way in Pig Latin");
					break; // if function for only if the first letter is a vowel

				}else if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') { // address all letters that are not vowels
					pigLatin = pigLatin + letter;// adds those letters to a new variable
					// System.out.println(pigLatin);
				} else {
					String sub = input.substring(i);// addresses the vowel and the remaining letters
					System.out.println(sub + pigLatin + "ay"); // prints the vowels with the remaining letters  adds the beginning vowels and way
					break;// because we are done break
	
				}

			}

		

		scan1.close();
	}

}
