import java.util.Arrays;

public class EvenOddArray {

	public static int[] replaceWithOnesAndZeros(int[] numbers) {

		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {

		if (numbers[i] % 2 == 0) {

		result[i] = 0;

		}
 
		else if (numbers[i] % 2 != 0) {
        
		result[i] = 1;

		}
		}

		return result;
	} 

	public static void main(String[] args) {

		int[] sampleInput = {4, 5, 8, 8, 8, 2, 9};
     
		int[] output = replaceWithOnesAndZeros(sampleInput);

		System.out.print(Arrays.toString(output));   
        
	}
}