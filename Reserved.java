import java.util.Scanner;
public class Reserved {

public static void main(String...args){
	Scanner sammy = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = sammy.nextInt();

	int a = (number / 10000) % 1000 % 100 % 10;
	int b = (number / 1000) % 100 % 10;
	int c = (number / 100) % 10;
	int d = (number / 10) % 10;
	int e = number % 10;

	System.out.print(e + "" + d + "" + c + "" + b + "" + a);
	

}

}