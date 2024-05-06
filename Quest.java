import java.util.Scanner;
public class Quest{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter int");
		int positiveNum = scanner.nextInt();
		for(int i = 1; i < 13; i++){
		System.out.printf("%n%d x %d = %d",positiveNum, i, positiveNum * i  );
		}





	}

}