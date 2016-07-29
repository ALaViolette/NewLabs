import java.util.Scanner;
public class AreaOfRoom {

	public static void main(String[]arg){
		
		double width = 0;
		double length = 0;
		double area = 0;
		double perimeter = 0;
		String cont = "yes";
		Scanner scan1 = new Scanner(System.in);
		
		
		while (cont.equalsIgnoreCase("yes")||cont.equalsIgnoreCase("y")){
		System.out.println("Enter the width of the room");
		width = scan1.nextDouble();
		scan1.nextLine();

		System.out.println("Enter the length of the room");
		length = scan1.nextDouble();
		scan1.nextLine();
			
		area = width * length;
		perimeter = 2 * width + 2 * length;
		
		System.out.print("The area of the room is " + area);
		System.out.println(" and the perimeter is " + perimeter);
		System.out.println("Would you like to measure another room?");
		cont = scan1.nextLine();
			
		}
		System.out.println("Goodbye!");
		
		
		scan1.close();
	}
}
