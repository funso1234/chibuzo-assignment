import java.util.Arrays;
import java.util.Scanner;
public class SortingArray{

	public static void main(String[]  args){

	int[] arr = {2,9,3,1,6};

	int[] numbers = arrays(arr);

	System.out.println(Arrays.toString(numbers));
	
	}

	public static int[]  arrays(int[] number){

	for(int count = 0; count < number.length; count++){

		for(int counter = 0; counter < number.length; counter++){

			if(number[count] < number[counter]){

			number[count] = number[count] + number[counter];

			number[counter] = number[count] - number[counter];

			number[count] = number[count] - number[counter];

	
			

		}
	
	}

	

	}

	return number;

	} 
		


}