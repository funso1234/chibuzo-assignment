import java.util.Scanner;

public class ScoreCollector {

	public static void main(String...args) {

		Scanner input = new Scanner(System.in);

		int totalScore = 0;
		int studentScore = 0;

		int average = 0;

		String[] studentNames = new String[5];

		int[] studentScores  = new int[5];

		for (int counter = 0; counter < 5; counter++) {
		
		System.out.print("Enter the studentNames: ");
		
		String studentName;
		
		studentName = input.nextLine();
		
		studentNames[counter] = studentName;
		
		System.out.println("Enter the student score: "); 
		
		studentScore  = input.nextInt();
		
		totalScore += studentScore;	
		
		studentScores [counter] = studentScore ;
		
		input.nextLine();
		
		}
		
		average = totalScore / 5;
			System.out.print("\t" + "Student names" + "\t\t" + "Student grades");
		for (int counter = 0; counter < 5; counter++) {
		
			System.out.println("\n" + "\t" + studentNames[counter] + "\t\t\t" + studentScores[counter]);

			//System.out.println(studentScores[counter]);
		}
		
		

		System.out.printf("\nThe total scores of student is: " + totalScore );

		System.out.printf("\nAverage score is: %d%n", average);
				
	}

}