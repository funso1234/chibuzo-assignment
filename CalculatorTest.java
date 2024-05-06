import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{
			
	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers(){
		int sum = Calculator.add(2, 2); 
		int expectedSum = 4;
		//assertion
		assertEquals(expectedSum,sum );

	}

	@Test
	public void testThatCalculatorCanSubstractTwoPositiveNumbers(){
		int minus = Calculator.substract(210, 200); 
		int expectedMinus = 10;
		//assertion
		assertEquals(expectedMinus,minus );

	}

	@Test
	public void testThatCalculatorCanAddTwoNegativeNumbers(){
		int sum = Calculator.add(-210, -200); 
		int expectedSum = -410;
		//assertion
		assertEquals(expectedSum,sum );
	}
	

	@Test
	public void testThatProductOfNumbers(){
		int product = Calculator.product(6, 4); 
		int expectedProduct= 24;
		//assertion
		assertEquals(expectedProduct,product );
	}


	@Test
	public void testThatEvenOfNumbers(){
		int even = Calculator.isEven(6); 
		int expectedEven= true;
		//assertion
		assertEquals(expectedEven,even );
	}





}