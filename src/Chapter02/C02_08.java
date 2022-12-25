package chapters.Chapter02;

/*
(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone.
*/

import java.util.Scanner;

public class C02_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter the time zone offset to GMT: ");

		int offset = input.nextInt();

		long totalMilliSeconds = System.currentTimeMillis();

		long totalSeconds = totalMilliSeconds / 1000;

		long currentSeconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHours = totalHours % 24;

		long currentHour = offset;

		System.out.println(" Your current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds);

	}

}
