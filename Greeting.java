/* Practice using Scanner
 */
//Import the Scanner utility
import java.util.Scanner;

//create a class that accepts user input by asking for name.
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("Hi " + name);
    }
}
