public class Main4 {
   public static int checkAge(int age) {
   
		if (age < 18) {
		System.out.println("you are not granted, you are not old enough");
		} else {
		System.out.println("you are granted, you are old enough");
		}

   }
	
   public static void main(String...args) {

		checkAge(20);

   }


}