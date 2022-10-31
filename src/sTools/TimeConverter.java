package sTools;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {

		/*
		 * This is just some simple program that offers a few time conversion units, and
		 * a certain variable computations were performed at each selections, at this
		 * point, I'm currently learning lots of Arrays.
		 */

		Scanner getIn = new Scanner(System.in);

		int seconds, minutes, hours, days;

		seconds = 60;
		minutes = 60;
		hours = 24;
		days = 1;

		int result;

		String[][] units = { { "Days to Hours", "Days to Minutes", "Days to Seconds" },
				{ "Hours to Minutes", "Hours to Seconds" }, { "Minutes to Seconds" } };

		System.out.println("Welcome to Time Converter tool!");
		System.out.println("(Please select the conversion unit you want to use)");

		System.out.println("");
		System.out.println("a) " + units[0][0]);
		System.out.println("b) " + units[0][1]);
		System.out.println("c) " + units[0][2]);
		System.out.println("d) " + units[1][0]);
		System.out.println("e) " + units[1][1]);
		System.out.println("f) " + units[2][0]);

		char selUnit;

		System.out.print("\nEnter your input: ");
		selUnit = getIn.next().charAt(0);

		System.out.println("");

		try {
			switch (selUnit) {
			case 'a':
				System.out.print("Enter the amount of days: ");
				days = getIn.nextInt();
				result = days * hours;
				if (days == 1) {
					System.out.println(days + " day is " + result + " hours!");
				} else if (days > 1) {
					System.out.println(days + " days is " + result + " hours!");
				} else if (days < 1) {
					System.out.println("You have entered an invalid input!");
				}
				break;
			case 'b':
				System.out.print("Enter the amount of days: ");
				days = getIn.nextInt();
				result = days * hours;
				result *= minutes;
				if (days == 1) {
					System.out.println(days + " day is " + result + " minutes!");
				} else if (days > 1) {
					System.out.println(days + " days is " + result + " minutes!");
				} else if (days < 1) {
					System.out.println("You have entered an invalid input!");
				}
				break;
			case 'c':
				System.out.print("Enter the amount of days: ");
				days = getIn.nextInt();
				result = days * hours;
				result *= minutes;
				result *= seconds;
				if (days == 1) {
					System.out.println(days + " day is " + result + " seconds!");
				} else if (days > 1) {
					System.out.println(days + " days is " + result + " seconds!");
				} else if (days < 1) {
					System.out.println("You have entered an invalid input!");
				}
				break;
			case 'd':
				System.out.print("Enter the amount of hours: ");
				hours = getIn.nextInt();
				result = hours * minutes;
				if (hours == 1) {
					System.out.println(hours + " hour is " + result + " minutes!");
				} else if (hours > 1) {
					System.out.println(hours + " hours is " + result + " minutes!");
				} else if (hours < 1) {
					System.out.println("You have entered an invalid input!");
				}
				break;
			case 'e':
				System.out.print("Enter the amount of hours: ");
				hours = getIn.nextInt();
				result = hours * minutes;
				result *= seconds;
				if (hours == 1) {
					System.out.println(hours + " hour is " + result + " seconds!");
				} else if (hours > 1) {
					System.out.println(hours + " hours is " + result + " seconds!");
				} else if (hours < 1) {
					System.out.println("You have entered an invalid input!");
				}
				break;
			case 'f':
				System.out.print("Enter the amount of minutes: ");
				minutes = getIn.nextInt();
				result = minutes * seconds;
				if (minutes == 1) {
					System.out.println(minutes + " minute is " + result + " seconds!");
				} else if (minutes > 1) {
					System.out.println(minutes + " minutes is " + result + " seconds!");
				} else if (minutes < 1) {
					System.out.println("You have entered an invalid input!");
				}
				break;
			default:
				System.out.println("That's not a valid input!");
			}
		} catch (Exception e) {
			System.out.println("That's not a valid number!");
		}

		getIn.close();

		System.out.println("");
		System.out.println("[Program completed]");

	}

}
