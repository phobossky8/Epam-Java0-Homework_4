package ldy.java0.hw4.helper;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AdditionalMenu {
	
	public static int addOptions(Scanner scanner) {
        int changer = -1;
        try {
            System.out.println("There are few options:");
            System.out.println("1. Search by number.");
            System.out.println("2. Search by keyword.");            
            System.out.println("Or enter '0' to exit.");
            
            changer = scanner.nextByte();
        } catch (NoSuchElementException ex) {
            System.out.println("Wrong input!");
            System.exit(0);
        }

        return changer;
    }
}
