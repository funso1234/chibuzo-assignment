import java.util.Scanner;
	public class Segment{
		public static void main(String... args){
		Scanner sammy = new Scanner(System.in);
		System.out.println("Enter number u want to display");
			String userInput = sammy.nextLine();

		switch(userInput)
		{
			case "1111110":	//zero
			  System.out.println(" \n| |\n||");
			  break;

			case "0110000":  // one
			 System.out.println("  \n |\n |");
			 break;

			case "1101101":	// two
			 System.out.println(" _ \n |\n|");
			break;

			case "1111001":	// three
			 System.out.println(" _ \n _|\n _|");
			break;

			case "0110011": // four
			 System.out.println("  \n|_|\n  |");
			break;
			
			case "1011011": // five
			 System.out.println(" \n| \n _|");
			break;
		
			case "1011111": //six
			  System.out.print( " \n| \n|_|");
			break;

			case"1110000"://seven
			  System.out.print("_\n |\n |");
			break;

			case"1111111"://eight
			 System.out.print(" \n||\n|_|");
			break;
	
			case "1110011": //nine
			  System.out.print(" \n||\n _|");
			break;


		}






		}












	}