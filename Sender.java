public class Sender {

public static int Package(int userInput) {

	int basePay = 5000;

	int result = 0;

	if (userInput < 50) {
	
		 result = userInput * 160 + basePay;
	}	

	if (userInput == 50 && userInput <= 59) {

		 result = userInput * 200 + basePay;
	}

	if (userInput == 60 && userInput <= 69) {

		 result = userInput * 250 + basePay;

	}

	if (userInput >= 70){

		 result = userInput * 500 + basePay;

	}
	
	return result;
}
}