public class ArrayBoolean {

	public static void main(String[] args) {

		int[] numbers = {4, 5, 8, 8, 8, 2, 9};

		boolean[] result = convertToBooleanArray(numbers);
        
		for (boolean b : result) {

		System.out.print(b + " ");

		}

	}

	public static boolean[] convertToBooleanArray(int[] array) {

		boolean[] booleanArray = new boolean[array.length];

		for (int i = 0; i < array.length; i++) {

		if (array[i] % 2 == 0) {


		booleanArray[i] = false;
 
		} else {

		booleanArray[i] = true;
 
		}

		}
        
		return booleanArray;

	}

}