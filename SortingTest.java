import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortingArrayTest{
	@Test
	public static void sortingArrayTest(){
	int []sum = SortingArray.sorted(new int []{2, 9, 3, 1, 6});
	int [] expectedSum = {1,2,3,6,9};
	assertArrayEquals(expectedSum,sum );


	}



}