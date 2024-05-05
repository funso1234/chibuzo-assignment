import java.util.Scanner;

public class ArrayName {

	public static void main(String...args) {

		Scanner input = new Scanner(System.in);

		String[] names = new String[5];

		for (int counter = 0; counter < 5; counter++) {
		
		System.out.print("Enter the name: ");
		String name;
		name = input.nextLine();
		names[counter] = name;
		}
		for (int counter = 0; counter < 5; counter++) {
			System.out.println(names[counter]);
		}
		
		
	}

}