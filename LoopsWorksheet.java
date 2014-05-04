package Default;
import java.util.Scanner;


public class LoopsWorksheet {

	public static void main(String[] args) {

		/////////// NUMBER 7 ///////////

		int looper = 1;

		for (looper = 1; looper <= 128; looper *= 2) {
			System.out.println(looper);
		}

		/////////// NUMBER 8 ///////////

		int sum = 0, inputNum;
	      int counter;
	      float mean;
	      Scanner NumScanner = new Scanner(System.in);
	      Scanner charScanner = new Scanner(System.in);

	      System.out.println("\nEnter the total number of terms whose mean you want to calculate");

	      counter = NumScanner.nextInt();

	      System.out.println("Please enter " + counter + " numbers:");

	      for(int x = 1; x<=counter ;x++){
	          inputNum = NumScanner.nextInt();
	          sum = sum + inputNum;
	          System.out.println();
	      }

	      mean = sum / counter;
	      System.out.println("The mean of the " + counter + " numbers you entered is " + mean);

	      /////////// NUMBER 9 ///////////

	      System.out.println("What is your pets name?");

	      Scanner pet = new Scanner (System.in);
	      String name = pet.nextLine();

	      System.out.println("How many times would you like your "
	      		+ "pets name to appear on the screen?");
	      Scanner num = new Scanner (System.in);
	      int count = num.nextInt();

        if (count <= 0 ) {
          System.out.println("Negative integers are not accepted.");
        }
        else {

          for (count = 0; count > 0; count++) {
            System.out.println(name);
          }

        }

	}

}
