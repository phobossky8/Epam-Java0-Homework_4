package ldy.java0.hw4.helper;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserMenu {
	
	public static int options(Scanner scanner) {
        int changer = -1;
        try {
            System.out.println("Choose type of action to do:");
            System.out.println("1. Show all exsisting tours.");
            System.out.println("2. Show tours sorted by price.");
            System.out.println("3. Show tour sorted by duration of tour.");
            System.out.println("4. Find tour by an option.");
            System.out.println("Or enter '0' to exit.");
            
            changer = scanner.nextByte();
        } catch (NoSuchElementException ex) {
            System.out.println("Wrong input!");
            System.exit(0);
        }

        return changer;
    }

}
