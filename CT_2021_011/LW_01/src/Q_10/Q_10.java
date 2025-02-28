package Q_10;

import java.util.Scanner;
import java.lang.*;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word: ");
        String input = scanner.nextLine();

        int numOfChar = input.length();
        int indexOfMiddle = numOfChar/2;

        String middleChar = input.substring(indexOfMiddle,indexOfMiddle+1);

        System.out.println(middleChar);
    }
}
