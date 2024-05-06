import java.util.*;

public class SamPractice{
public static void main(String...a){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter size of the array");
int afeez = scanner.nextInt();
int [] sam = new int[afeez];


for ( int i =0; i < afeez; i++){
System.out.print("enter array element " + i  + " : ");
sam[i]= scanner.nextInt();
}
System.out.println("everything wey de inside our array  ");
for (int i = 0; i < afeez; i++){
}
System.out.print( Arrays.toString(sam));

}
}


