import java.util.Scanner;
   public class Kata{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
	Kata kata = new Kata();
	
        System.out.println("Check even number");
	kata.isEvenCheck();
	System.out.println();
	
	System.out.println("Check prime number");
	kata.isPrimeNumberCheck();
	System.out.println();
	
	System.out.println("Check positive difference");
	Kata.subtractNumberCheck();
	System.out.println();

	System.out.println("Check quotient");
	Kata.divideNumberCheck();
	}

	public static boolean isEvenCheck(){
	
	System.out.print("Enter a number ");
	int number = input.nextInt();

		if (number % 2 == 0){
		System.out.println(number + " is an even number");
	 	return true;
		}
		else{
		System.out.print(number + " is not an even number");
		return false;
		}
	}
		

	
      public static boolean isPrimeNumberCheck(){
		System.out.print("Enter a number ");
		int number = input.nextInt();

         	int counter = 0;
         	for(int count = 1; count <= number; count++){
           	if(number % count == 0) counter++; 
     		}
           	if(counter == 2) {
		System.out.println(number + " is a prime number");
		return true;
		}
		else {
		System.out.println(number + " is not a prime number");
		return false;
		}
     		}


	public static int subtractNumberCheck(){
		System.out.print("Enter a number ");
		int numOne = input.nextInt();
		System.out.print("Enter another number ");
		int numTwo = input.nextInt();
		int difference = 0;
		if(numOne == numTwo){
		difference = 0;
		}
		else if(numOne > numTwo){
		difference = numOne - numTwo;
		}
		else if(numOne < numTwo){

		difference = numTwo - numOne;
		}
		System.out.println("Difference = "+ difference);
		return difference; 
         } 

     

	public static float divideNumberCheck(){
		System.out.println("Enter a number ");
		int numOne = input.nextInt();
		System.out.print("Enter another number ");
		int numTwo = input.nextInt();
		float quotient = 0;
		if(numTwo == 0){
		System.out.printf("quotient = %.2f", quotient);
		}
		else{
		quotient = numOne / numTwo;
		System.out.printf("quotient = %.2f", quotient );
			
		}

	 	return quotient;
	
	

	}


}
