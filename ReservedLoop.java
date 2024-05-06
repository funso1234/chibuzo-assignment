import java.util.Scanner;
public class ReservedLoop {
public static void main(String...args){
	Scanner sam = new Scanner(System.in);
	System.out.println("Enter the integer: ");
	String number = sam.nextLine();
	int reverse = 0;
	for (int i = number.length()-1; i <= 0; i--) {
      		reverse += i;
	}
       System.out.print(reverse);

}

}