package Chapter03.InterviewQuestions;

import java.util.Scanner;

public class HaftaiçiÇalışıyorumHaftaSonuYatıyorum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a day, as a digit (1-7)");
		
		int day = input.nextInt();
		
				
		String status="";
	
		
		switch (day) {
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:{ day = 5; status="Çalışıyorum!";
		}break;		
		case 6:
		case 7:{ day = 7; status="Yatıyorum!";
		}break;
		
		}
			System.out.println(status );
		
		}

}
