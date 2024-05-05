import java.util.Scanner;

public class AgeCollector {

	public static void main(String...args) {

		Scanner input = new Scanner(System.in);

		int[] ages = new int[5];

		for (int counter = 0; counter < 5; counter++) {
		
		System.out.print("Enter the age: ");
		int age = 0;
		age = input.nextInt();
		ages[counter] = age;
		}
		for (int counter = 0; counter < 5; counter++) {
			System.out.println(ages[counter]);
		}
		
		
	}

}