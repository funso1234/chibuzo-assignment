import java.util.*;
public class Practice3 {
public static void main(String...args) {
Scanner input = new Scanner(System.in);

	System.out.println("Enter the size of array: ");
	int size = input.nextInt();
	int[] array = new int[size];

	for(int i = 0; i < size; i++) {
	System.out.println("Enter the element of array: ");
	array[i] = input.nextInt();
	}
	for(int i = 0; i < size; i++) {
	}
	System.out.print(Arrays.toString(array));
}
}