public class Part2{

	public static void main(String...args) {

		for (int counter = 0; counter < 10; counter++) {
			for (int count = 10; count > counter-1; count--) {
				System.out.print("*");
			}
		System.out.println("");
		}
	}

}