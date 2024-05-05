import java.util.Scanner;
public class SenderMain {
	
	public static void main(String...args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of dispatch rider");
		
		int userInput = input.nextInt();
	
		int dispatch = Sender.Package(userInput);	
	
		System.out.println(dispatch);
	

	}


}