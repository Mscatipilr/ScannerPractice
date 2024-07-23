/* Practice using Scanner and different variable inputs */
import java.util.NoSuchElementException;
import java.util.Scanner;
//input a variety of variables and display them.
public class VariableInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaring variables now so they are available outside the try blocks.
        String text = "";
        int integer = 0;
        double dub = 0.0;
        boolean bool = false;
        //ask for text input.
        System.out.print("Enter a string of text: ");
            text = in.nextLine();

        // ask for integer input and catch any errors
        while (true) {
            System.out.print("Enter an integer: ");
            try {
                integer = in.nextInt();
                break; // break out of the loop if input is valid
            } catch (NoSuchElementException e) {
                System.out.println("That is not an integer. Try again.");
                in.next(); // clear the invalid input
            }
        }

        // ask for double input and catch any errors
        while (true) {
            System.out.print("Enter a double: ");
            try {
                dub = in.nextDouble();
                break; // break out of the loop if input is valid
            } catch (NoSuchElementException e) {
                System.out.println("That is not a double. Try again.");
                in.next(); // clear the invalid input
            }
        }

        // ask for boolean input and catch any errors
        while (true) {
            System.out.print("Enter a boolean value: ");
            try {
                bool = in.nextBoolean();
                break; // break out of the loop if input is valid
            } catch (NoSuchElementException e) {
                System.out.println("That is not a boolean. Try again.");
                in.next(); // clear the invalid input
            }
        }

        System.out.println("Your string is " + text + ".");
        System.out.println("Your integer is " + integer + ".");
        System.out.println("Your dub is " + dub + ".");
        System.out.println("Your bool is " + bool + ".");
    }
}
