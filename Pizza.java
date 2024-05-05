import java.util.Scanner;
public class Pizza{
public static void main(String...args){
	Scanner sammy = new Scanner(System.in);
	System.out.print("Enter the number of guess: ");
	int guess = sammy.nextInt();

	System.out.print("Enter the pizza type: ");
	String pizza = sammy.next();

	int sapaSize = 4;;
	int smallMoney = 6;
	int bigBoys = 8;
	int odogwu = 12;
	int totalBox = 0;
	int leftOver = 0;
	if (pizza.equalsIgnoreCase("sapa")){
	if (guess % sapaSize != 0){
	totalBox = guess / sapaSize + 1;
	leftOver = totalBox * sapaSize - guess;
	}

	else {
	totalBox = guess / sapaSize;
	}
	}
	else if (pizza.equalsIgnoreCase("small")){
	if (guess % smallMoney != 0){
	totalBox = guess / smallMoney + 1;
	leftOver = totalBox * smallMoney - guess;
	}
	else {
	totalBox = guess / smallMoney;
	}
	}
	else if (pizza.equalsIgnoreCase("big")){
	if (guess % bigBoys != 0){
	totalBox = guess / bigBoys + 1;
	leftOver = totalBox * bigBoys - guess; 
	}

	else{
	totalBox = guess / bigBoys;
	}
	}

	else if (pizza.equalsIgnoreCase("odo")){
	if (guess % odogwu != 0){
	totalBox = guess / odogwu + 1;
	leftOver = totalBox * odogwu - guess;
	}

	else{
	totalBox = guess / odogwu; 
	}
	}
	System.out.print("Number of boxes to buy" + totalBox);
	System.out.print("Number of left over slices" + leftOver);
}

}