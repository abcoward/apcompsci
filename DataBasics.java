import java.util.Scanner;
public class DataBasics {

	public static void main(String[] args) {

		// bunch'o'scanners
		Scanner nm = new Scanner (System.in);
		Scanner q = new Scanner (System.in);
		Scanner d = new Scanner (System.in);
		Scanner n = new Scanner (System.in);
		Scanner p = new Scanner (System.in);
		Scanner tot = new Scanner (System.in);

		// define el variables
		double penniesTotal, nickelsTotal, dimesTotal, quartersTotal, total;

		// enter user name
		System.out.println("Please enter your first and last name.");
		String name = nm.nextLine();

		// quarters
		System.out.println("How many quarters do you have?");
		double quarters = q.nextDouble();

		// dimes
		System.out.println("How many dimes do you have?");
		double dimes = d.nextDouble();

		// nickels
		System.out.println("How many nickels do you have?");
		double nickels = n.nextDouble();

		// pennies
		System.out.println("How many pennies do you have?");
		double pennies = p.nextDouble();

		// totals
		System.out.println("You have " + pennies * .01 + " cents in pennies...");
		System.out.println("You have " + nickels * 5 / 100 + " cents in nickels...");
		System.out.println("You have " + dimes * .10 + " cents in dimes...");

		// cents vs. dollars
		if (quarters >= 4) {
			System.out.println("You have " + quarters * .25 + " dollars in quarters...");
		}

		else {
			System.out.println("You have " + quarters * .25 + " cents in quarters... \n");
		}


		// grand total
		System.out.println("Add up your total on your own. Then type it in. \n");
		total = tot.nextDouble();

		// avg dollars per week
		System.out.println("You save an average of " + total + " dollars per week.");

		// avg dollars per year
		System.out.println("\nWell at this rate you can save about " + total * 52 + " dollars in year.");



	}

}
