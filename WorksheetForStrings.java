package Default;
import java.util.Scanner;

public class WorksheetForStrings {

	public static void main(String[] args) {

		System.out.println("Please enter your last name. \n");

		// define last name scanner //
		Scanner lastNm = new Scanner (System.in);

		// define variables for email and King Arthur //
		String lastName = lastNm.nextLine();
		String person = "King Arthur";
		String replace = person.replace("King Arthur", "Guinnevere");

		// prints email address //
		System.out.println(lastName + "@camelot.com");

		// print King Arthur & Guinnevere//
		System.out.println("\n" + person);
		System.out.println(replace);

		// define all scanners for name and address //
		Scanner name = new Scanner (System.in);
		Scanner address = new Scanner (System.in);
		Scanner city = new Scanner (System.in);
		Scanner state = new Scanner (System.in);
		Scanner zip = new Scanner (System.in);

		System.out.println("\nEnter your full name:");
		System.out.println("Enter your street address:");
		System.out.println("Enter the name of the city you live in:");
		System.out.println("Enter the state you live in");
		System.out.println("Enter your zip code: \n");

		String userName = name.nextLine();
		String userAddress = address.nextLine();
		String userCity = city.nextLine();
		String userState = state.nextLine();
		int userZip = zip.nextInt();

		System.out.println("\n" + userName + "\n" + userAddress + "\n" + userCity
		+ "\n" + userState + "\n" + userZip);

		// define variables for King Arthur's father //
		String father = "Pendragon, Uther";
		String fatherFirstName = father.substring(11, 16);
		String fatherLastName = father.substring(0, 9);

		// print King Arthur's father's first and last name //
		System.out.println("\n" + fatherFirstName + " " + fatherLastName);

		// ask user to caption the picture //
		System.out.println("\nType a caption for the picture on the top of the page.");

		// define scanner for the picture caption
		Scanner caption = new Scanner (System.in);

		// define variable for the caption //
		String userCaption = caption.nextLine();
		String captionSub = userCaption.substring(3, 4);

		// print the caption
		System.out.println(userCaption);

		// print length of caption //
		System.out.println("\nThe length of your caption is " + userCaption.length() + " characters long." );
		System.out.println("\nThe fourth letter in your caption is " + captionSub + ".");


	}

}
