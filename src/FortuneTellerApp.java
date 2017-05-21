import java.util.Scanner;

public class FortuneTellerApp {

	//method to check for Quit
		public static void checkForQuit(String userInput){
			if(userInput.equalsIgnoreCase("Quit")){
				System.exit(0);
			}
		}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Output questions to console----

		System.out.println("What is your firstname?");
		String firstName = input.next();
		//This method checks to see if the user wants to quit
		checkForQuit(firstName);

		System.out.println("What is your lastname?");
		String lastName = input.next();
		//This method checks to see if the user wants to quit
		checkForQuit(lastName);

		System.out.println("What is your age?");
		//int userAge = input.nextInt();
		String ageString = input.next();
		//method to check for Quit
		checkForQuit(ageString);
		//changing string to integer
		int userAge = Integer.parseInt(ageString);

		System.out.println("What month were you born 1- 12?");
		//int birthMonth = input.nextInt();
		String birthMonthString = input.next();
		//method to check for Quit
		checkForQuit(birthMonthString);
		//changing string to integer
		int birthMonth = Integer.parseInt(birthMonthString);
		

		System.out.println("What is your favorite ROYGBIV color? If you do not know what ROYGBIV means enter \"Help\".");
		String favColor = input.next();
		//This method checks to see if the user wants to quit
		checkForQuit(favColor);
		
        //If a user input a correct ROYGBIV color do nothing else if they ask for help display color list and ask again
		if (favColor.equalsIgnoreCase("red") || favColor.equalsIgnoreCase("orange")
				|| favColor.equalsIgnoreCase("yellow") || favColor.equalsIgnoreCase("green")
				|| favColor.equalsIgnoreCase("blue") || favColor.equalsIgnoreCase("indigo")
				|| favColor.equalsIgnoreCase("violet")) {

			// If user inputs a correct color the if statement does nothing

		} else if (favColor.equalsIgnoreCase("help")) {
			System.out.println("Red\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");

			System.out.println("What is your favorite ROYGBIV color? If you do not know what ROYGBIV means enter \"Help\".");
			favColor = input.next();

			if (favColor.equalsIgnoreCase("red") || favColor.equalsIgnoreCase("orange")
					|| favColor.equalsIgnoreCase("yellow") || favColor.equalsIgnoreCase("green")
					|| favColor.equalsIgnoreCase("blue") || favColor.equalsIgnoreCase("indigo")
					|| favColor.equalsIgnoreCase("violet")) {

				// If user inputs correct  color if statement does nothing

			} else if (favColor.equalsIgnoreCase("help")) {
				System.out.println("Red\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");
			}

		}

		System.out.println("How many siblings do you have");
		//int siblingNumber = input.nextInt();
		String siblingNumberString = input.next();
		//method to check for Quit
		checkForQuit(siblingNumberString);
		//changing string to integer
		int siblingNumber = Integer.parseInt(siblingNumberString);

		// user retireAge code block----

		if (userAge % 2 == 0) {
			// even aged people retire at 62
			userAge = 62 - userAge;
		} else {
			// odd aged people retire at 65
			userAge = 65 - userAge;
		}

		// -Siblings code block----
		String vacationHome;

		if (siblingNumber < 0){
			vacationHome = "Fukushima, Japan";
		}else{
		
		switch (siblingNumber) {
		case 0:
			vacationHome = "Negril, Jamaica";
			break;
		case 1:
			vacationHome = "Miami, FL";
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
		
		//  ROYGBIV transportation code block----
		String transportation;
        favColor = favColor.toLowerCase();
        
		switch (favColor) {
		case "red":
			transportation = "BMW";
			break;
		case "orange":
			transportation = "Porche";
			break;
		case "yellow":
			transportation = "school bus";
			break;
		case "green":
			transportation = "yacht";
			break;
		case "blue":
			transportation = "bicycle";
			break;
		case "indigo":
			transportation = "hoverboard";
			break;
		default:
			transportation = "jet ski";
			break;

		}

		//birth month code block----
		String retirementMoney;
		
		if (birthMonth == 1 || birthMonth == 2  || birthMonth == 3 || birthMonth == 4 ){
			retirementMoney = "20000.00";
		}else if(birthMonth == 5 || birthMonth ==6  || birthMonth == 7 || birthMonth == 8 ){
			retirementMoney = "40000.00";
		}else if(birthMonth == 9 || birthMonth ==10  || birthMonth == 11 || birthMonth == 12 ){
			retirementMoney = "60000.00";
		}else{
			retirementMoney = "0.00";
		}
					
		
		// Console display output
		System.out.println(firstName + " "+ lastName + " will retire in " + userAge + " years with $" + retirementMoney + " in the bank, a vacation home in " +
		vacationHome + " and a " + transportation +".");
		
		input.close();

	}

}
