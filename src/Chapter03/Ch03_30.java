package Chapter03;

import java.util.Scanner;

public class Ch03_30 { //(Current time)

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT: ");
		
		int offset = input.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		
		Long totalMilliseconds = System.currentTimeMillis();
		
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		Long totalSeconds = totalSeconds % 60;
		
		
		// Compute the current second in the minute in the hour
		Long currentSecond = totalSeconds % 60;
		
		
		// Obtain the total minutes
		Long totalMinutes = totalMinutes / 60;
		
		
		// Compute the current minute in the hour
		Long currentMinute = totalMinutes % 60;
		
		
		// Obtain the total hours
		Long totalHours = totalMinutes / 60;
		
		
		// Compute the current hour
		Long currentHour = totalHours %24;
		currentHour = currentHour + offset;
		
		
		// Display results
		System.out.println(
				"Current time is " + ((currentHour > 12) ? currentHour - 12 : 
				currentHour) + ":" + currentMinute + ":" + currentSecond +
				((currentHour > 12) ? " PM" : " AM"));
		
		//  ----------- EKSİKLER VAR
	}

}
