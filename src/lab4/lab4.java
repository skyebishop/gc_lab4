package lab4;

import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int i;
		int userNumber = 0;
		String userDecision = "";

		System.out.println("Learn your squares and cubes!");

		do {
			System.out.println("Enter a number:");
			userNumber = scnr.nextInt();
			System.out.printf("-----------------------\n");
			System.out.printf("Number " + " Squared " + " Cubed\n");
			System.out.printf("-----------------------\n");

			for (i = 1; i <= userNumber; i++) {
				System.out.printf("%-7d %-8d %-7d\n", i, i * i, i * i * i);
			}
			System.out.println("Would you like to continue (y/n)?");
			userDecision = scnr.next();
		} while (userDecision.equals("y"));
		System.out.println("Goodbye!");

	}

}
