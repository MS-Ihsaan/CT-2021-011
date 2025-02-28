package Q_11;

import java.util.Scanner;
import java.lang.*;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();

        String middleLetter = middleName.substring(0,1);

        System.out.println(lastName+", "+firstName+" "+middleLetter);
    }
}
