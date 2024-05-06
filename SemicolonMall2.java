import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class SemicolonMart{

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

		input.nextLine();
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


	for (counter = 0; counter < item.size(); counter++) {
	System.out.println(item.get(counter)+ "\t" + quantity.get(counter)+ "\t" + 	price.get(counter)+ "\t" + grandTotal.get(counter));
	subTotal += grandTotal.get(counter);

	}

        double discount = costDiscount * subTotal / 100;

	double vat = 17.50 / 100 * subTotal;
	double billTotal = subTotal + discount + vat;
	
	System.out.println("How much did customer give to you? :");
	int amountPaid = input.nextInt();
	double balance = billTotal - amountPaid;

	System.out.println("=====================================================");
	
	System.out.printf("Sub Total :                  \t%.2f", subTotal);
        
        System.out.printf("Discount :                    \t%.2f", discount);

        System.out.printf("VAT @17.50:                   \t%.2f", vat);
	
	System.out.println("=====================================================");

	System.out.printf("Bil Total:     \t%.2f", billTotal);
	
	System.out.printf("Amount paid:     \t%.2f",amountPaid);

	System.out.printf("Balance:     \t%.2f", balance);

	System.out.println("=====================================================");
	
	System.out.println("THANK YOU FOR YOUR PATRONAGE");

	System.out.println("=====================================================");	

	




	




}

}