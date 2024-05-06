import java.util.Scanner;

public class AccountTest{

public static void main(String...args){

Scanner sammy = new Scanner(System.in);

Account myAccount = new Account();

System.out.printf("initial name:%s%n%n", myAccount.getName());

System.out.println("Enter the name: ");
String theName = sammy.nextLine();
myAccount.setName(theName);
System.out.println();

System.out.printf("the name in myAccount is:%n%s%n", myAccount.getName());
}
} 