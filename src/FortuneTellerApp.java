import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Output questions to console---------------------------------------

		System.out.println("What is your firstname?");
		String firstName = input.next();

		System.out.println("What is your lastname?");
		String lastName = input.next();

		System.out.println("What is your age?");
		int userAge = input.nextInt();

		System.out.println("What month were you born 1- 12?");
		int birthMonth = input.nextInt();

		// ROYGBIV code block-------------------------------------------------

		System.out
				.println("What is your favorite ROYGBIV color? If you do not know what ROYGBIV means enter \"Help\".");
		String favColor = input.next();

		if (favColor.equalsIgnoreCase("red") || favColor.equalsIgnoreCase("orange")
				|| favColor.equalsIgnoreCase("yellow") || favColor.equalsIgnoreCase("green")
				|| favColor.equalsIgnoreCase("blue") || favColor.equalsIgnoreCase("indigo")
				|| favColor.equalsIgnoreCase("violet")) {

			// If user inputs a correct color the if statement does nothing

		} else if (favColor.equalsIgnoreCase("help")) {
			System.out.println("Red\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");

			System.out.println(
					"What is your favorite ROYGBIV color? If you do not know what ROYGBIV means enter \"Help\".");
			favColor = input.next();

			if (favColor.equalsIgnoreCase("red") || favColor.equalsIgnoreCase("orange")
					|| favColor.equalsIgnoreCase("yellow") || favColor.equalsIgnoreCase("green")
					|| favColor.equalsIgnoreCase("blue") || favColor.equalsIgnoreCase("indigo")
					|| favColor.equalsIgnoreCase("violet")) {

				// If user inputs a color if statement does nothing

			} else if (favColor.equalsIgnoreCase("help")) {
				System.out.println("Red\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");
			}

		}

		System.out.println("How many siblings do you have");
		int siblingNumber = input.nextInt();

		// user retireAge code block---------------------------------------

		if (userAge % 2 == 0) {
			// even aged people retire at 62
			userAge = 62 - userAge;
		} else {
			// odd aged people retire at 65
			userAge = 65 - userAge;
		}

		// ------Siblings code block-------------------------------------
		String vacationHome;

		if (siblingNumber < 0){
			vacationHome = "the swamp";
		}else{
		
		switch (siblingNumber) {
		case 0:
			vacationHome = "Atlanta, GA";
			break;
		case 1:
			vacationHome = "Negril, Jamaica";
			break;
		case 2:
			vacationHome = "Los Angeles, CA";
			break;
		case 3:
			vacationHome = "Hilton Head, SC";
		default:
			vacationHome = "St. Thomas, VI";
			break;
		}
		}
		// Second ROYGBIV code block-------------------------------------

		String transportation;

		switch (favColor) {
		case "red":
			transportation = "BMW";
			break;
		case "orange":
			transportation = "Porche";
			break;
		case "yellow":
			transportation = "School Bus";
			break;
		case "green":
			transportation = "yachct";
			break;
		case "blue":
			transportation = "bicycle";
			break;
		case "indigo":
			transportation = "hoverboard";
			break;
		default:
			transportation = "Honda";
			break;

		}

		//birth month code block------------------------------------------------------
		String money;
		
		if (birthMonth == 1 || birthMonth ==2  || birthMonth == 3 || birthMonth == 4 ){
			money = "20000.00";
		}else if(birthMonth == 5 || birthMonth ==6  || birthMonth == 7 || birthMonth == 8 ){
			money = "40000.00";
		}else if(birthMonth == 9 || birthMonth ==10  || birthMonth == 11 || birthMonth == 12 ){
			money = "60000.00";
		}else{
			money = "0.00";
		}
			
		
		// Test statement-------------------------------------------------
		System.out.println(firstName + lastName + userAge + birthMonth + favColor + siblingNumber);
		System.out.println(vacationHome);
		System.out.println(transportation);
		System.out.println(money);
		
		System.out.println(firstName + " "+ lastName + " will retire in " + userAge + " years with $" + money + " in the bank, a vacation home in " +
		vacationHome + " and a " + transportation+".");
		
		input.close();

	}

}
