import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class SemicolonMall{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;
	
	ArrayList<String> item = new ArrayList<String>();
	ArrayList<Integer> quantity = new ArrayList<Integer>();
	ArrayList<Integer> price = new ArrayList<Integer>();
	ArrayList<Integer> grandTotal = new ArrayList<Integer>();

	System.out.println("What Is The Customer's Name");
	String customerName = input.nextLine();
	
	int sum = 0;
	int subTotal = 0;

	String response = "";

	Date date = new Date();

	do{

		System.out.println("What Did The User Buy?");
		String userBuy = input.nextLine();

		System.out.println("How Many Pieces?");;
		int pieces = input.nextInt();

		System.out.println("How Much Per Unit?");
		int perUnit = input.nextInt();
		
		int total = pieces * perUnit;

		item.add(userBuy);
		quantity.add(pieces);
		price.add(perUnit);
		grandTotal.add(total);
   
		System.out.println("Add More Items?");
		String moreItems = input.nextLine();

		if (moreItems.equals("no")) {	
		}

		}while(response.equals("yes"));

	System.out.println("What Is The Cashier's Name?");
	String cashierName = input.nextLine();

	System.out.println("How Much Discount Will He Get");
	int costDiscount = input.nextInt();

	System.out.println("=====================================================");
	System.out.println("ITEM        QTY         PRICE           TOTAL(NGN)");
	System.out.println("-----------------------------------------------------");


	for (counter = 0; counter < items.size; counter++) {
	System.out.println(item.get(counter) + quantity.get(counter) +price.get(counter) +   grandTotal.get(counter));
	subTotal += grandTotal.get(counter);

	}

        double discount = costDiscount * subTotal / 100;

	double vat = 17.50 / 100 * subTotal;
	double billTotal = subTotal + discount + vat;

	System.out.println("=====================================================");
	
	System.out.println("Bill Total: ");
	
	System.out.println("=====================================================");

	
	
	
		



}

}