import java.util.Scanner;
public class GroupPigLatin {
	public static void main(String[]arg){
		Scanner scan1 = new Scanner(System.in);
		String translatedWord;
		char firstLetter;
		String userInput;
		
		System.out.println("Please enter a word to be translated into Pig Latin");
		//String userInput = scan1.nextLine();
		userInput = scan1.nextLine().toLowerCase();
		translatedWord = userInput.substring(1); // addresses the character at 1 and the remaining characters
		firstLetter = userInput.charAt(0);
		translatedWord= translatedWord + firstLetter + "ay";//re assign the translated word
		
		if(firstLetter=='a'||firstLetter =='e'||firstLetter=='i'|| firstLetter=='o'|| firstLetter=='u' )
		System.out.println(userInput+"way");
		else
		System.out.println(translatedWord);
	
		
		scan1.close();}

}
