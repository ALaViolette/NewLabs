import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentDatabase {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int request;
		String info = "";
		String cont = "yes";

		// row then column
		String[][] studentDataBase = { { "Ambyr", "red", "ocean diving" },
				{ "Tommy", "orange", "running 10K on the weekend" }, { "Grace", "green", "climbing mountains" },
				{ "DeeAnn", "teal", "practicing her gymnastic floor routine" }, { "Janna", "marigold" + "Skydiving" },
				{ "Kristen", "purple", "Freerunning" }, { "Blair", "lavendar", "flying airplanes" },
				{ "Jamila", "blue", "driving race cars" }, { "Laurin", "pink", "cliff jumping" },
				{ "Vonnita", "grey", "motorcross" }, { "LaTresha", "rosegold", "snowboarding" },
				{ "Valerie", "amber", "DJing in vegas" }, { "Gerrae", "Aqua", "training in taekwondo" },
				{ "Tracy", "Burgundy", "training tigers" }, { "Lily", "yellow", "taming wild horses" },
				{ "Karen", "orange", "playing women's football" }, { "Abbi", "blue", "test driving exotic supercars" },
				{ "Shruti", "purple", "equestrianism" },
				{ "Amy", "silver", "hosting exculsive parties at her mansion " }, { "Noor", "red", "singing opera" },
		};
		

		System.out.println("Welcome to Ambyr's class\n");
		System.out.println(
				"Which student would you like to learn more about? " + "Please enter a number between 1 and 20");
		while (cont.equalsIgnoreCase("yes")|| cont.equalsIgnoreCase("y")) {
			try{
				request = scan.nextInt();
				scan.nextLine();
				System.out.println("Student  " + request + " is " + studentDataBase[request - 1][0]);
				System.out.println("What else would you like to know about " + studentDataBase[request - 1][0] + "?"
						+ " For favorite color enter \"color\" or \"hobby\" "
						+ "to find out what they like to do in their spare time ");
				info = scan.nextLine();
				if (info.equalsIgnoreCase("color"))
					System.out.println(studentDataBase[request - 1][0] + "'s favorite color is "
							+ studentDataBase[request - 1][1]);
				else if (info.equalsIgnoreCase("hobby"))
					System.out.println(
							studentDataBase[request - 1][0] + "'s hobby is " + studentDataBase[request - 1][2]);
				
				else{
					try 
					{ throw new ArrayIndexOutOfBoundsException();}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("This is not a valid option, please enter color or hobby");}
				}
				
//				System.out.println("Would you like to find info on another student?");
//				cont = scan.nextLine();
				
			} catch (NoSuchElementException e) {
				System.out.println("Invalid input please enter a number");
				scan.nextLine();	
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(
						"Invalid input! You entered a number outside of the range please enter a number between 1 and 20");
			} 
			
	
		}System.out.println("Goodbye!");
	}
}
