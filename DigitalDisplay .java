import java.util.Scanner;

public class Display {

	public static void main(String...args) {

	Scanner sammy = new Scanner(String...args);

	System.out.print("Enter display digit");

	int display = sammy.nextInt();
	
	Switch(display)
	{

	case 0:

		System.out.println("_\n||\n |");
		break;
	case 1:
		System.out.println(" \n |\n |");
		break;
	case 2: 
		System.out.println("_\n_|\n|_");
		break;
	case 3: 
		System.out.println("_\n_|\n_|");
		break;
	case 4: System.out.println(" \n|_|\n |");
		break;
	}
	}


} 