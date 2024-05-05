import java.util.Scanner;
public class Main {
public static void main(String...args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = input.nextInt();
	int[] array = new int[n];

	System.out.println("Enter " +(n)+ " array elements: ");
	for(int i = 0; i < n; i++) {
		array[i] = input.nextInt();

	}
	System.out.println("Element in array are: ");
	for(int i = 0; i < n; i++) {
		System.out.println(array[i]);
	}	

}
}