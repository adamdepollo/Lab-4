/*
 * @Adam DePollo, 10/16/19
 */
package co.grandcircus;

import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		// Declare variables and create scanner
		int userEntry;
		String cont = "";
		boolean b;
		Scanner scnr = new Scanner(System.in);

		// greet the user and request they input an integer
		System.out.println("Learn your squares, cubes, and multiples!");

		// create a while loop based on whether the user would like to continue
		do {
			System.out.println("Enter an integer:");
			// take integer input
			userEntry = scnr.nextInt();
			// call makeTable method on user input
			makeTable(userEntry);
			System.out.println("\nContinue? (y/n)");
			scnr.nextLine();
			cont = scnr.nextLine();
			b = getCont(cont);

		} while (b == true);
		// close the scanner
		System.out.println("Bye!");
		scnr.close();
	}

	// create method to calculate the square of the user entry
	public static int calcSquare(int userEntry) {
		return userEntry * userEntry;
	}

	// create method to calculate the cube of the user entry
	public static int calcCube(int userEntry) {
		return userEntry * calcSquare(userEntry);
	}

	public static boolean getCont(String userEntry) {
		if (userEntry.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

	// create a method that will generate a formatted table of cubes and squares
	// based on the user entry
	public static String makeTable(int userEntry) {
		System.out.printf("%-7s | %-7s | %-7s\n", "Number", "Squared", "Cubed");
		System.out.println("============================");
		for (int i = userEntry; i >= 1; --i) {
			System.out.printf("%-7s | %-7s | %-7s\n", i, calcSquare(i), calcCube(i));
		}

		System.out.println("============================");
		System.out.println("Multiples");
		System.out.println("============================");

		for (int i = userEntry; i >= 1; --i) {
			System.out.printf("%-7s | %-3s | %-7s\n", (userEntry + " x " + i), "=", (userEntry * i));
		}

		return "";
	}

}
