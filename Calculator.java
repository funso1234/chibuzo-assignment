public class Calculator{


	public static int add (int firstNumber, int secondNumber){
		return firstNumber + secondNumber;
	}

	public static int substract (int firstNumber, int secondNumber){
		return firstNumber - secondNumber;
		

	}

	public static int addTwoNegativeNumber (int firstNumber, int secondNumber){
		return firstNumber + secondNumber;	

	}

	public static int product (int firstNumber, int secondNumber){
		int sum = 0;

		for (int i = 0; i <= secondNumber; i++){
			sum += firstNumber;
		}
		return sum;
	}
	public static boolean isEven(int number) {

	if (number % 2==0) {
	return true;

 	}else{

	return false;
	}
	}
	

}