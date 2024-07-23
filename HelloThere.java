/* Practice using Scanner */
import java.util.Scanner;

//Now that the scanner utility is imported... continue with boilerplate.
public class HelloThere {
    public static void main(String[] args) {
        //invoke instance of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today? ");
        String reply = sc.nextLine();
        System.out.println("Wow - Interesting! Tell me more! ");
        String reply2 = sc.nextLine();
        System.out.println("Okay. Nice chatting with you! Goodbye!");
    }
}
